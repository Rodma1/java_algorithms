package com.chengyunzhi;

import javax.naming.ldap.SortControl;

public class 快速排序 {
	static int[] array= {3,44,38,5,47,15,36};
	public static void main(String args[]) {
		int begin=0;
		int end=array.length;
		sort(begin, end);
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+"_");
		}
	}
//	通过左闭右开[begin,end)的思想用递归的方法不断的取出轴点进行排序
	public static void sort(int begin ,int end) {//T(n)=2*T(n/2)+O(n)=nlogn
//		至少要两个元素
		if (end-begin<2) {
			return;
		}
//		通过快排思想取出轴点最后要放置的下标
		int middel=pivotIndex(begin, end);//O(n)
//		排序[begin,middel)之间的元素
		sort(begin ,middel);//T(n/2)
//		排序[middel+1,end)之间的元素
		sort(middel+1,end);//T(n/2)
	}
	/*
	 * 构造出[begin,end)范围的轴点元素
	 * return:返回轴点元素的最终位置
	 * 左右交替遍历
	 */
	public static int pivotIndex(int begin,int end) {
//		为了避免出现最坏情况,随机选择一个轴点元素跟begin位置进行交换
//在[begin,end)里面选一个,end1是在[begin,end)里面随机选出来的
		int end1=begin+(int)(Math.random()*(end-begin));
		int temp=array[begin];
		array[begin]=array[end1];
		array[end1]=temp;
//		首先我们设定数组的第一个数为轴点,将其进行备份
		int pivot=array[begin];
//		将end先减到最末尾元素的下标
		end--;
//		将比轴点pivot小于等于的数放在左边，循环终止时begin==end
		while(begin<end) {

			while(begin<end) {
//				从右向左判断,如果pivot小于array[end],end就--,否则begin++
				if (array[end]>pivot) {
					end--;
				}else {
//					将end位置的数覆盖掉begin位置的数
					array[begin]=array[end];
					begin++;
//					跳出循环，进行左向右遍历
					break;
				}
			}

			while(begin<end) {
//				从左向右判断,如果pivot大于array[begin],begin++,否则end--
				if (array[begin]>pivot) {
					array[end]=array[begin];
					end--;
//					跳出循环，进行右向左遍历
					break;
				}else {
					begin++;
				}
			}
			
		}
//		最后在将轴点坐标赋值轴元素
		array[begin]=pivot;
		return begin;
	}
	
}
