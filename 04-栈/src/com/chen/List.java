package com.chen;
//接口设计
public interface List<E> {
	
//	添加元素push
	void push(E element);
	
//	获取元素pop
	E pop();
//	获取栈顶元素
	E peek();
//	获取大小
	int size();
	
//	是否为空
	boolean isEmpty();
//	清空
	void clear();
	
	
}
