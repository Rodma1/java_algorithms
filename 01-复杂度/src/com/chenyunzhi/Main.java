package com.chenyunzhi;

public class Main {
	
//	递归解法
	public static int fib1(int n) {
//	    如果n小于1那么就只有0，直接返回就可以了  
		if (n<=1) return n;
		return fib1(n-2)+fib1(n-1);
	}
	

//	常用解法
	public static int fib2(int n) {
//	    如果n小于1那么就只有0，直接返回就可以了  
		if (n<=1) return n;
//	    定义0，和1,还有相加后的下一个数sum
		int first=0;
		int second=1;
		int sum=0;
//		通过for循环遍历相加
		for (int i=0;i<n-1;i++) {
			sum=first+second;
			first=second;
			second=sum;
		}
		return sum;
	        	        
	}
//	线性代数解法
	public static int fib3(int n) {
//		定义根号5
		double c=Math.sqrt(5);
		return (int)((Math.pow((1+c)/2,n)-Math.pow((1-c)/2, n))/c);
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int sum=fib2(1);
		System.out.println(sum);
		int sum3=fib3(6);
		System.out.println(sum3);
	}

}
