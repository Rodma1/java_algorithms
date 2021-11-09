package com.yun;


//implements表示要全部实现List里面的所有方法
public class LinkedList<E> implements List<E>{
//	我们定义一个属性来获取链表的大小
	private int size;
//	链表是由多个节点构成的，每一个节点都可以看做是一个类，需要一个元素和下一个节点的地址
//	初始化元素和节点
	E element;
	private Node<E> first;
	private static class Node<E>{//我们这里设置一个内部类
//			定义下一个节点
		E element;
		Node<E> next;
//		这个类需要一个元素和下一个节点地址
		public Node(E element,Node<E> next){
			this.element=element;
			this.next=next;
		}		
	}
	@Override
	public void clear() {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void add(E element) {
		// TODO 自动生成的方法存根
		add(size,element);
	}
//移除某个指定位置的元素
	@Override
	public void remove(int index) {
//		获取这个元素的前一个元素的位置
		Node<E> node=node(index-2);
		node.next=node.next.next;
		
	}
	@Override
	public int size() {
		// TODO 自动生成的方法存根
		return size;
	}

	@Override
	public boolean isEmpty() {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public boolean contains(E element) {
		// TODO 自动生成的方法存根
		return false;
	}
//	获取index位置的元素
	@Override
	public E get(int index) {
		// TODO 自动生成的方法存根
		
		return node(index-1).element;
	}
// 存储到index 位置
	@Override
	public void add(int index, E element) {
		
		// TODO 自动生成的方法存根
		if (index==0) {
			first=new Node<>(element, first);
		}else {
			
//			获取index位置的元素
			Node<E> node=node(index-1);
			
//			node指向新增的节点,新增的节点指向node之前的下一个元素
			node.next=new Node<>(element, node.next);
	
//			大小加一
		}
		size++;
	}

	@Override
	public int indexOf() {
		// TODO 自动生成的方法存根
		return 0;
	}
//	获取指定位置index的下一个元素index+1
	public Node<E> node(int index) {
		Node<E> node=first;
		for(int i=0;i<index;i++) {
			node=node.next;
		}
		return node;
	}
	@Override
	public String toString() {
		StringBuilder string = new StringBuilder();
		string.append("size=").append(size).append(", [");
		Node<E> node = first;
		for (int i = 0; i < size; i++) {
			if (i != 0) {
				string.append(", ");
			}
			
			string.append(node);
			System.out.println(node.element);
			node = node.next;
		}
		string.append("]");
		return string.toString();
	}
	
}
