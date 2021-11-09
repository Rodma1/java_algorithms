package com.chen;
//实现栈的接口
public class Stack<E> implements List<E>{
//	定义元素属性
	private int size;

//	定义栈的存储空间
	private static final int DEFAULT_CAPACITY=10;
//	创建栈空间，跟创建动态数组一样
	private E[] elements=(E[]) new Object[DEFAULT_CAPACITY];
//	入栈
	@Override
	public void push(E element) {
		// TODO 自动生成的方法存根
		elements[size++]=element;
		
	}
//	出栈
	@Override
	public E pop() {
		// TODO 自动生成的方法存根
		
		return elements[size--];
	}

	@Override
	public E peek() {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public int size() {
		// TODO 自动生成的方法存根
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public void clear() {
		// TODO 自动生成的方法存根
		
	}
	@Override
	public String toString() {
		// TODO 自动生成的方法存根
		// size=3, [99, 88, 77]
		StringBuilder string = new StringBuilder();
		string.append("size=").append(size).append(", [");
		for (int i = 0; i < size; i++) {
			if (i != 0) {
				string.append(", ");
			}
			
			string.append(elements[i]);
			
//			if (i != size - 1) {
//				string.append(", ");
//			}
		}
		string.append("]");
		return string.toString();
	}

}
