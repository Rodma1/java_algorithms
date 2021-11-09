package com.chen;

import java.util.LinkedList;
import java.util.Queue;

import com.chen.dao.TreeDao;
import com.chen.dao.comparator;
import com.mj.printer.BinaryTreeInfo;

public class BinarySearchTree<E> implements TreeDao<E>,BinaryTreeInfo {
	
	int size;
	private comparator<E> comparator;
	
//	头节点
	private Node<E> root;
//	定义一个内部类
	public static class Node<E>{
//		元素
		E element;
//		根节点
		Node<E> parent;
//		左节点
		Node<E> left;
//		右节点
		Node<E> right;
//		定义有参构造函数
		public Node(E element,Node<E> parent) {
			this.element=element;
			this.parent=parent;
		}
		public boolean isLeaf() {
			return left == null && right == null;
		}
		
		public boolean hasTwoChildren() {
			return left != null && right != null;
		}
	}
	public BinarySearchTree() {
		this(null);
	}
	
	public BinarySearchTree(comparator<E> comparator) {
		this.comparator = comparator;
	}
	@Override
	public int size() {
		// TODO 自动生成的方法存根
		return size;
	}

	@Override
	public boolean isEmpty() {
		// TODO 自动生成的方法存根
		return size==0;
	}

	@Override
	public void clear() {
		// TODO 自动生成的方法存根
		size=0;
		root=null;
	}

	@Override
	public void add(E element) {
		// TODO 自动生成的方法存根
		if (element==null) {
			throw new IllegalArgumentException("element not null");
		}
//		添加第一个节点
		if (root==null) {
//			这里null是因为第一个节点没有父节点
			root=new Node<E>(element,null);
			size++;
			return;
		}
//		添加不是第一个节点
//		找到父节点
		Node<E> parent=root;
//		设置指针
		Node<E> node=root;
		
		int cmp=0;
//		通过循环找到需要插入节点的父节点位置
		do {
//			将传入的值和父节点作比较
			cmp=compare(element,node.element);
//			注意这一步，我们要一直获取父节点
			parent=node;
//			如果element大于父节点parent.element就放在node.right右边,如果小于就左边，如果相等就覆盖
			if (cmp>0) {//说明大于父节点
				node=node.right;
			}else if (cmp<0) {
				node=node.left;
			}else {
				node.element=element;
				return;
			}
		} while (node!=null);
//		给这个元素定义新节点
		Node<E> newNode=new Node<E>(element, parent);
		
//		判断插入到父节点的左边还是右边，
		if (cmp > 0) {
		    parent.right = newNode;
		} else {
		    parent.left = newNode;
		}
		size++;
		
	
	}

	@Override
	public void remove(E element) {
		// TODO 自动生成的方法存根
		remove(node(element));
	}
	@SuppressWarnings("unused")
	private void remove(Node<E> node){
		if (node==null) {
			return;
		}
//		删除肯定要少一个元素
		size--;
//		如果是删除度为2的节点,左右节点都不为null
		if (node.hasTwoChildren()) {
//			找到其后继节点，将后继节点替换该节点
			Node<E> s=successor(node);
//			将后继节点的值覆盖该节点
			node.element=s.element;
			System.out.println(node.element);
//			将node变成后继节点，这样子就变成了删除后继节点就可以了
			node=s;
		}
//		获取这个要删除结点的子节点，由分析可以知道，要删除的节点要么度为1或者为0
		Node<E> replacement=node.left==null?node.right:node.left;
//		如果是度为1，
		if (replacement!=null) {
//			更改子节点指向的父节点，将node他的子节点交给node他的父节点就可以了
			replacement.parent=node.parent;
//			如果node他是root根节点，没有父节点,那么将根节点变成node的子节点
			if (node.parent==null) {
				root=replacement;
			}
//			如果不是根节点，然后判断一下node是在父节点的左还是右，将父节点指向node的子节点
			else if (node==node.parent.left) {
				node.parent.left=replacement;
			}
			else {
				node.parent.right=replacement;
			}
		}
//		如果度为0，并且是叶子结点又是根节点（相当于就一个节点），那么可以直接删除
		else if (node.parent==null) {
			root=null;
		}
//		否则是度为0，但不是根节点，只是叶子结点，直接判断其位置删除
		else {
			if (node==node.parent.left) {
				node.parent.left=null;
			}else{// node == node.parent.right
				node.parent.right=null;
			}
		}
		
	}
	@Override
	public boolean contains(E element) {
		// TODO 自动生成的方法存根
		return node(element)!=null;
	}
//	自定义比较器:比较父节点和子节点的大小
	private int compare(E o1,E o2) {
		if (comparator!=null) {
			return comparator.compare(o1, o2);
		}
//		如果没有传参，就用java中默认的构造器，如果不传，表示E强制去使用Comparable接口,强制转换
		return ((Comparable<E>)o1).compareTo(o2);
		
	}
	
//	查找相等元素
	private Node<E> node(E element){
		Node<E> node=root;
//		与输入进来的元素跟根节点比较
		while(node!=null) {
			int cmp=compare(element,node.element);
			if (cmp==0) {
				return node ;
			}
			if (cmp>0) {
				node=node.right;
			}else if (cmp<0) {
				node=node.left;
			}
		}
// 如果没有相等的就直接返回null
		return null;
	}
//	调用后序遍历类
	public void postorder(Visitor<E> visit) {
//		如果没有传入visit对象参数就直接返回
		if (visit==null) {
			return;
		}
//		导入根节点
		postorder(root,visit);
	}
//	通过后序遍历实现遍历
	public void postorder(Node<E> node,Visitor<E> visit) {
		if (node==null) {
			return;
		}
//		后序遍历是先遍历左右在遍历根节点
		postorder(node.left,visit);
		postorder(node.right,visit);
//		如果stop为true说明已经到达所想要的元素，就直接返回
		if (visit.stop) {
			return;
		}
//		判定是否是想要的元素
		visit.stop=visit.visit(node.element);
//		System.out.print(node.element+"_");
	}
//	实现遍历接口,我们这里的目的是将每个元素都放入到接口中
	public void levelOrder(Visitor<E> visitor) {
		if (root==null||visitor==null) {
			return;
		}
//		定义队列
		Queue<Node<E>> queue =new LinkedList<Node<E>>();
//		根节点入队
		queue.offer(root);
//		使用层序遍历实现
		while(!queue.isEmpty()) {
//			获取节点,出队
			Node<E> node =queue.poll();
//			将元素放入接口，实现调用
			if(visitor.visit(node.element)) return;
//			发过左右根节点不为空就入队
			if (node.left!=null) {
				queue.offer(node.left);
			}if (node.right!=null) {
				queue.offer(node.right);
			}
		}
	}
//	前驱节点的调用接口
	public E predecessor(E element){
//		调用node查找到元素放入到类中
		Node<E> node=predecessor(node(element));
//		System.out.println(node.element);
		return node.element;
	}
//	获取前驱节点
	public Node<E> predecessor(Node<E> node){
//		如果输入为空就直接返回
		if (node==null) {
			return null;
		}
//		node的前驱节点一定在他的左边
		if (node.left!=null) {
			node=node.left;
//			然后一直往右遍历
			while(node.right!=null) {
				node=node.right;
			}
			return node;
		}
//		如果node的左边为null，那么寻找他的父节点
		
//		如果父节点为空或在父节点的右边就结束判断
		while(node.parent!=null&&node==node.parent.left) {
			node=node.parent;
		}
		return node.parent;
	}
//	获取后继节点
	private Node<E> successor(Node<E> node){
//		如果传入的节点为空就返回
		if (node==null) {
			return null;
		}
		// 前驱节点在左子树当中（right.left.left.left....）
		Node<E> p = node.right;
		if (p!=null) {

//			然后向左遍历
			while(p.left!=null) {
				p=p.left;
			}
			return p;
		}
//		如果右边为空，那么就找其元素的父节点，如果节点在父节点的左边就终止
		while (node.parent!=null&&node==node.parent.right) {
//			获取父节点
			node=node.parent;	
		}
//		最后遍历完后就输出他的父节点
		return node.parent;
	}
//	遍历接口
	public static abstract class Visitor<E> {
		boolean stop;
		public abstract boolean visit(E element);
	}
	//打印
//	根节点
	@Override
	public Object root() {
		return root;
	}

//	左节点
	@Override
	public Object left(Object node) {
//		强制转为node类型
		return ((Node<E>)node).left;
	}

	@Override
	public Object right(Object node) {
		return ((Node<E>)node).right;
	}
//打印
	@Override
	public Object string(Object node) {
//		Node<E> myNode = (Node<E>)node;
//		String parentString = "null";
//		if (myNode.parent != null) {
//			parentString = myNode.parent.element.toString();
//		}
//		return myNode.element + "_p(" + parentString + ")";
	
		return ((Node<E>)node).element;
	}
}
