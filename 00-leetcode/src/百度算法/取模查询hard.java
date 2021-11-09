package 百度算法;

import java.util.Arrays;
import java.util.Scanner;

public class 取模查询hard {
	public  static void main(String args[]) {

		Scanner st=new Scanner(System.in);
//		非负整数的数量和行数
		int n=st.nextInt();
		int q=st.nextInt();
//		元素
		int[] a=new int[n];
		
//		输入元素
		for(int i=0;i<n;i++) {
			a[i]=st.nextInt();
		}
		int m=0;
		int r=0;
		int sum=0;
//		排序
		Arrays.sort(a);
		while(q>0) {
			m=st.nextInt();
			r=st.nextInt();
			int num=r;
			int i=0;
			int j=2;
			while(i<n) {
				if (num==a[i]) {
					sum+=num;
				}else if(a[i]>num) {
	
					num=m*(j++)+r;
					continue;
				}
				i++;
			}
			System.out.println(sum);
			sum=0;
			q--;
		}

	}
}
