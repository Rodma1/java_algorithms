package 百度算法;

import java.util.Scanner;
/*
 * http://oj.importos.com/voj/p/1048
 */
public class _P1048_二进制二 {
	public  static void main(String args[]) {
//		可以按照规律判断，奇数肯定1多,且第二个奇数1多的是2*n-1,最多1的二进制：3,7,15,31,63,127,255
		Scanner st=new Scanner(System.in);
		Long i=st.nextLong();
		Long j=(long) 3;
		while(i>=j){
			j=j*2+1;
		}
		System.out.print(j/2);

	}
}
