package com.chengyunzhi;

public class 插入排序_二分搜索优化 {
	static int[] array= {3,44,38,5,47,15,36};
	public static void main(String args[]) {
//		通过for循环排序
		for(int i=1;i<array.length;i++) {
			insert(i, search(i));
		}
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+"_");
		}
	
	}
	
	
	
/*
 * 	插入排序,通过推移排序,传入要插入的值的下标和要插入的下标，下标通过二分搜索获得
 */
	public static void insert(int source,int index) {
		int cur=array[source];
//		通过for循环将原来的大于source下标元素的数向右移动一格
		for(int i=source;i>index;i--) {
			array[i]=array[i-1];
		}
//		这时index位置就空出来了
		array[index]=cur;
	}
	// 我们要找的是第一个大于v的位置
	public static int search(int index) {
//			定义左右中间位置
		int left=0,right=index,pivot=0;
//			通过while循环遍历,直到左右相等或者左大于右
		while(right>left) {
//				定义中间坐标
			pivot=(right+left)>>1;//这里的>>1相当于除于2
			if (array[index]<array[pivot]) {
				right=pivot;
			}
			else {
				left=pivot+1;
			}
//				System.out.print(right);
		}
//		返回待插入的位置
		return left;
	}
}
