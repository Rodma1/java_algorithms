package com.chen;

import com.chen.dao.TreeDao;
import com.chen.dao.Visitor;

import java.util.LinkedList;
import java.util.Queue;
import com.chen.dao.comparator;

public class BinarySearchTreeTwo<E> implements TreeDao<E>{
//    定义头节点
    private Node<E> root;
    private comparator<E> comparator;
    private int size;
//无参比较器
    public BinarySearchTreeTwo() {
    this(null);
}
//    自定义比较器
    public BinarySearchTreeTwo(comparator<E> comparator) {
        this.comparator = comparator;
    }


    //    设置内部类
    private static class Node<E>{
        E element;
        Node<E> right;
        Node<E> left;
//        父节点
        Node<E> parent;
        public Node(E element,Node<E> parent){
            this.element=element;
            this.parent=parent;
        }

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public void clear() {
        size=0;
        root=null;
    }

    /**
     * 添加元素
     * @param element
     */
    @Override
    public void add(E element) {
        elementNotNullCheck(element);
//        添加第一个节点
        if (root==null){
            root=new Node<>(element,null);
            size++;
            return;
        }
        // 添加的不是第一个节点
        // 找到父节点
        Node<E> parent=root;
//        定义一个指针
        Node<E> node=root;
        int cmp=0;
        do{
//            默认情况大的在右小的在左
            cmp=compare(element,node.element);
            //			注意这一步，我们要一直获取父节点
            parent=node;
//           如果cmp大于0,说明节点值比根节点大，放在右边
            if (cmp>0){
                node=node.right;
            }
            else if (cmp<0){
                node=node.left;
            }
            else{//相等就覆盖
                node.element=element;
                return;
            }
        }while (node!=null);
//        上面已经判断出元素应该插入到那个节点上,我们为元素创建一个节点
        Node<E> newNode=new Node<>(element,parent);
        if (cmp>0){
            parent.right=newNode;
        }
        else {
            parent.left = newNode;
        }
        size++;
    }

    @Override
    public void remove(E element) {

    }

    @Override
    public boolean contains(E element) {

        return node(element)!=null;
    }
//    查找相等元素
    private Node<E> node(E element){
        //        定义指针
        Node<E> node=root;
//        与输入进来的元素做比较
        while (node!=null){
            int cmp=compare(element, node.element);
            if (cmp==0){
                return node;
            }
            else if (cmp<0){
                return node=node.left;
            }
            else if (cmp>0){
                return  node=node.right;
            }
        }
        return null;
    }
//    判断传入的元素
    private void elementNotNullCheck(E element){
        if (element==null){
            throw  new IllegalArgumentException("element must not");
        }
    }
//    判断节点和父节点的大小
    private int compare(E o1,E o2){
//        自定义接口比较器
        if(comparator!=null){
            return comparator.compare(o1,o2);
        }
        //		如果没有传参，就用java中默认的构造器，如果不传，表示E强制去使用Comparable接口,强制转换
        return ((Comparable<E>)o1).compareTo(o2);
    }
    //获取根节点值
    public E getRootElement() {
        return root.element;
    }
//    打印节点
//    实现遍历接口，层序遍历
    public void levelOrder(Visitor<E> visitor) {
        if (root==null||visitor==null){
            return;
        }
//        定义队列
        Queue<Node<E>> queue=new LinkedList<Node<E>>();
//        根节点入队
        queue.offer(root);
        while(!queue.isEmpty()){
//            出队
            Node<E> node=queue.poll();
//            将元素放入接口实现调用
            visitor.visit(node.element);
//            左右节点不为空就入栈
            if (node.left!=null){
                queue.offer(node.left);
            }
            if (node.right!=null){
                queue.offer(node.right);
            }
        }
    }


}
