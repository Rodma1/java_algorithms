package com.chengyunzhi;


public class 计数排序 {
	static int[] array= {7,3,5,8,6,7,4,5};
	public static void main(String args[]) {
		sort();
	}
	public static void sort() {
//		找出最大值
		int max=0;
		for(int arr:array) {
			max=Math.max(max, arr);
		}//O(n)
//		开辟内存空间,存每个整数出现的次数
		int[] counts=new int[max+1];
//		统计出现次数
		for(int arr:array) {
			counts[arr]++;
		}//O(n)
//		根据次数进行排序
		int index=0;
		for(int i=0;i<counts.length;i++) {
			while(counts[i]-->0) {
				array[index++]=i;
			}
		}//O(n)
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+"_");
		}
	}
}
