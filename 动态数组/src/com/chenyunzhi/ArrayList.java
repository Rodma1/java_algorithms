package com.chenyunzhi;

import javax.sound.midi.Soundbank;

//消除警告
@SuppressWarnings("unchecked")
public class ArrayList<E> {
//	定义用户存入元素的数量
	private int size;
//	获取所有的元素,通过泛型可以存放任何数据类型
	private E[] elements;
//	DEFAULT_CAPACITY容量，final表示常量，static保证DEFAULT_CAPACITY的内存只有一份
	private static final int DEFAULT_CAPATICY=10;
//	如果不符合数组值，就返回-1
	private static final int ELEMENT_NOT_FOUND=-1;
//	有参构造函数,传入数组长度
	
	public ArrayList(int capaticy) { 
//		如果传入的空间小于10，就用10
		capaticy=(capaticy<DEFAULT_CAPATICY)?DEFAULT_CAPATICY:capaticy;
//		设置数组
		elements=(E[]) new Object[capaticy];
	}
//	无参构造函数
	public ArrayList(){
//		ArrayList对象时候会先调用这个把DEFAULT_CAPACITY传递到有参里面比较大小
		this(DEFAULT_CAPATICY);
	}
	
	
//	元素数量
	public int size() {
		return size;
	}
//	是否为空
	public boolean isEmpty() { 
		return size==0;
	}
//	是否包含某个元素
	public boolean contains(E element) { 
		for(int i=0;i<size;i++) {
			if (elements[i]==element) {
				return true;
			}
		}
		return false;
	}
//	添加元素到最后面
	public void add(E element) { 

//		elements[size++]=element;	
		add(size,element);
	}
//	返回index位置对应的元素
	public  E get(int index) { 
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index:" + index + ", Size:" + size);
		}
		return elements[index];
	}
//	设置index位置的元素
	public E set(int index , E element) { 
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index:" + index + ", Size:" + size);
		}
		E old=elements[index];
		elements[index]=element;
		
		return old;
		
	}
//	往index里面添加元素
	public void add(int index,E element) { 
		if (index<0||index>size) {
			throw new IndexOutOfBoundsException("Index:" + index + ", Size:" + size);
		}
		ensureCapacity(size+1);
//		如果elements的数组长度大于元素长度，那么说明还可以存放
//		if (elements.length>=size+1) {}
//			重新遍历，将元素存进去，在index位置插入，index后边的元素往后移
		for(int i=size;i>index;i--) {
//				往后移
			elements[i]=elements[i-1];
			
		}
//			index位置为空了
		elements[index]=element;
//			数组扩容一位，size大小加一
		size++;
		

	}
//	删除index位置的元素
	public E remove(int index) {
		
		if (index<0||index>=size) {
			throw new IndexOutOfBoundsException("Index:" + index + ", Size:" + size);
		}
		E oldvalue=elements[index];
		for(int i=index+1;i<size;i++) { 
			elements[i-1]=elements[i];
		}
//		不用删除数组，只要把它定为空才好
		elements[--size]=null;
		return oldvalue;
	}
//	查看元素索引
	public int indexOf(E element) {
//		如果传入的为空null，那么要判断数组里面是否为空
		if (element==null) {
			for(int i=0;i<size;i++) {
				if (elements[i]==null) {
					return i;
				}
			}
		}
		else {
			for(int i=0;i<size;i++) {
		
				if (element.equals(elements[i])) {
					return i;
				}
			}
		}
		return ELEMENT_NOT_FOUND;
		
	}
	
//	清除所有元素
	public void clear() {
		size=0;
	}
//	扩容 ，保证要有capacity的容量
	private void ensureCapacity(int capacity) {
		int oldCapacity=elements.length;
		if (oldCapacity>=capacity) {
			return;
		}
//		如果还有容量就不用扩容，否则就得扩容1.5倍
		int newCapacity=oldCapacity+(oldCapacity>>1);
//		新建一个动态数组
		E[] newElements=(E[]) new Object[newCapacity];
		
		for(int i=0;i<size;i++) {
			newElements[i]=elements[i];
		}
		elements=newElements;
		System.out.println(oldCapacity+"扩容为"+newCapacity);
	}
	
	
	
	@Override
	public String toString() {
		// size=3, [99, 88, 77]
//		字符串拼接建议使用 StringBuilder
		StringBuilder string=new StringBuilder();
		string.append("size=").append(size).append("[");
		for(int i=0;i<size;i++) {
			if (i!=0) {
				string.append(",");
				
			}
			string.append(elements[i]);
		}
		string.append("]");
		return string.toString();
	}
}