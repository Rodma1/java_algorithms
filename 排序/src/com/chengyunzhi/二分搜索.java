package com.chengyunzhi;

public class 二分搜索 {
//搜索指定值的下标
	public static void main(String args[]) {
		int[] array= {1,2,3,4,5,6};
		int n=2;
		int num=search1(array, n);
		System.out.print(num);
	}
/*
 * 查找元素在有序数组中的位置	
 */
//	这个查找函数算法不稳定，比如我们要查找数组{1,2,2,2,4,5,6}第一个2的下标1，他却返回3
	public static int search(int[] array,int n) {
//		定义左右中间位置
		int left=0,right=array.length,pivot=0;
//		通过while循环遍历,直到左右相等或者左大于右
		while(right>left) {
//			定义中间坐标
			pivot=(right+left)>>1;//这里的>>1相当于除于2
			if (n<array[pivot]) {
				right=pivot;
			}
//			否则如果想要的值大于中间值左边就改变
			else if(n>array[pivot]) {
				left=pivot+1;
			}
//			否则就是两个数相等，取到下标privot返回
			else {
				return pivot;
			}
		}
		return pivot;
	}

/*
 * 查找元素在有序数组中待插入的位置
 * - 假设在 `[begin, end)` 范围内搜索**某个元素 v**，`mid == (begin + end) / 2`
 * - 如果 `v < m`，去 `[begin, mid)` 范围内二分搜索
 * - 如果 `v ≥ m`，去 `[mid + 1, end)` 范围内二分搜索
 */
	// 我们要找的是第一个大于v的位置
	public static int search1(int[] array,int v) {
//		定义左右中间位置
		int left=0,right=array.length,pivot=0;
//		通过while循环遍历,直到左右相等或者左大于右
		while(right>left) {
//			定义中间坐标
			pivot=(right+left)>>1;//这里的>>1相当于除于2
			if (v<array[pivot]) {
				right=pivot;
			}
			else {
				left=pivot+1;
			}
//			System.out.print(right);
		}
		return left;
	}
	
}
