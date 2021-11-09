package 百度算法;

import java.util.Scanner;

public class _P1047_二进制 {
	public static void main(String args[]) {
		Scanner st=new Scanner(System.in);
		Long i=st.nextLong();
		int sum=0;
		while(i>0) {
			
			if (i%2==1) {
				sum++;
			}
			i=i>>1;
		}
		System.out.print(sum);
	}
}
