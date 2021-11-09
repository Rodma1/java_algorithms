package 百度算法;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//题目要分析清除
public class 向下取整数列 {
	public static void main(String[] args) {
		Scanner st=new Scanner(System.in);
		Long x=st.nextLong();
////		List<Integer> list =new ArrayList<>();
////		list.add(1);
//		long num=0;
//		int m=0;
//		Long i=(long) 1;
////		(x%2==0?x/2:(x+1)/2)
//		while(i<=x/2) {
//			
////			if (!list.contains(num)) {
////				list.add(num);
////			}
//			if (num==x/i) {
//				i=x/(num-1);
//				continue;
//			}
//			num=x/i;
//			System.out.print(num+"_");
//			m++;
//			i++;
//		}
//		System.out.println(m+1);
////		现在可以准确求出f(n)的m有多少个了，接下来就是求有多少个f(n)是m
		Long m=x/2+1;
		System.out.println(m);
	}
}
