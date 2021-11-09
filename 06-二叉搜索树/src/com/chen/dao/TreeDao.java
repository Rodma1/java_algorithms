package com.chen.dao;

public interface TreeDao<E> {
//	元素数量
	int size();
//	是否为空
	boolean isEmpty();
//	清空所有元素
	void clear();
//	添加元素
	void add(E element);
//	删除元素
	void remove(E element);
//	是否包含元素
	boolean contains(E element);
}
