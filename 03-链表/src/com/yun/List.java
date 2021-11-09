package com.yun;

//定义需要的接口
public interface List<E> {

//	清空元素
	void clear() ;
	
//	添加元素
	void add(E element);
//	移除某个指定位置的元素
	void remove(int index);
//	获取大小
	int size();
	
//	判断是否为空
	boolean isEmpty();
	
//	是否包含某个元素
	boolean contains(E element);
	
//	获取指定位置的元素
	E get(int index);
	
//	添加指定位置的元素
	void add(int index,E element);
	
//	获取指定元素坐标
	int indexOf();

}
