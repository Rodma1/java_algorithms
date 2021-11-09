package com.chengyunzhi;

public class 选择排序 {
	public static void main(String[] args) {
		int[] array= {3,44,38,5,47,15,36};
//		我们的目标是遍历找到最大的数，放到最后面
// 遍历完后将最后一个数排除继续遍历
		for(int end=array.length;end>0;end--) {
//			假设下标0位置的数最大
			int maxIndex=0;
//			从前往后比较
			for(int begin=1;begin<end;begin++) {
				
	//			如果后面有数比这个设定的数还大，那么下标就改变
				if (array[maxIndex]<array[begin]) {
					maxIndex=begin;
				}
			}
//			在将最大的数和最后边的数交换位置，下次遍历就不遍历最大的数了
			int temp=array[maxIndex];
//				将后面的数变成前面的数
			array[maxIndex]=array[end-1];
//				前面的数变成后面的数
			array[end-1]=temp;
		}
		
		for(int c:array) {
			System.out.print(c+",");
		}
			
	}
}
