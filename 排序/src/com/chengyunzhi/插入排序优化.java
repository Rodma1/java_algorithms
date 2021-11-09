package com.chengyunzhi;


public class 插入排序优化 {
	public static void main(String args[]) {
		//定义数组
		int[] array= {3,44,38,5,47,15,36};
//		通过for循环遍历
		for(int i=1;i<array.length;i++) {
//			通过前后两个数比较，由于是升序排序
			int cur=i;
			int c=array[cur];
//			通过while循环遍历cur,也就是前面排序好的数,如果cur为零或者后面数大于前面就不循环
			while(cur>0&&c-array[cur-1]<0) {
				array[cur]=array[cur-1];
				cur--;
			}
//			最后将递减后得到的cur下标赋值上元素
			array[cur]=c;
		}
		
//		循环输出看结果
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+"_");
		}
		
	}

}
