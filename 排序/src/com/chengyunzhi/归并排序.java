package com.chengyunzhi;

public class 归并排序 {
	static int[] array= {3,44,38,5,47,15,36};
	static int[] leftArray=new int[array.length>>1];
	public static void main(String args[]) {
		sort(0,array.length);
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+"_");
		}
	}
//	先分割后合并
	public static void sort(int begin,int end) {
//		至少要有两个元素
		if (end-begin<2) {
			return;
		}
//		获取中间结点，因为我们要获取数组左右两半(分割)
		int mid=(begin+end)>>1;
//		再通过递归的方法分割
		sort(begin, mid);//左闭右开[begin,mid)
		sort(mid, end);//左闭右开[mid,end)
//		然后将他们一个个排序合并
		merge(begin,mid,end);
	}
//	合并merge
//	定义一个新的数组包含[begin,mid)前一半的元素
	public static void merge(int begin,int mid,int end) {
//		定义左右两个数组下标
		int li=0,le=mid-begin;//左边数组[0,le)(基于leftArray)
		int ri=mid,re=end;//右边数组(基于array)
		int ai=begin;//array的索引
//		通过for循环拷贝左边数组到leftArray
		for(int i=li;i<le;i++) {
			leftArray[i]=array[begin+i];
		}
//		通过while循环比较那个数大，进行排序
		while(li<le) {
			if (ri<re&&array[ri]-leftArray[li]<0) {
				array[ai++]=array[ri++];//拷贝右边数组到array
			}else {
				array[ai++]=leftArray[li++];//拷贝左边数组到array
			}
		}//cmp位置改为<=会失去稳定性
	}
}
