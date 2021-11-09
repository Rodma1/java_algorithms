package 百度算法;

import java.math.BigInteger;
import java.util.Scanner;

public class P1049二进制三 {
	public  static void main(String args[]) {

//		可以按照规律判断，奇数肯定1多,且第二个奇数1多的是2*n-1,最多1的二进制：3,7,15,31,63,127,255
		Scanner st=new Scanner(System.in);
		Long R=st.nextLong();
		Long L=st.nextLong();
		if (R==L) {
			System.out.println(R);
		}
		else if (R<1||L>Math.pow(10, 15)||R>L) {
			System.out.println(1);
		}else {
			//		Long num=(long) 0;
			Long j= (long)3;
			while(L>=j){
				j=j*2+1;
			}
			System.out.println(j);
	//		BigInteger b=new BigInteger("1000000");//1010
	//		System.out.print(Long.parseLong(b.toString(2)));
			if (j/2>=R) {
				System.out.println(j/2);//11111111
			}else {
	//			L = Long.parseLong(Long.toBinaryString(L));
				String s = Long.toBinaryString(j);
	//			int len=s.length()-1;
	//			num=Long.parseLong(s);
	//			StringBuilder ss = new StringBuilder(s);
	//			int left=1;
				Long k=(long) (s.length()-1);
				while(j>L) {
	//				System.out.println(k);
					j=j & ~ (1<<(k-1));
					k--;
	//				ss.setCharAt(left, '0');;
					
	//				left++;
				}

				k=(long) (s.length()-1);
				while(j<R) {
					System.out.println(j);
					j=j ^ (3<<(k-2));
					k--;
	//				ss.setCharAt(left, '0');;
					
	//				left++;
				}

	//			while(num>L) {
	////				System.out.println(num);
	//				num=num-(long)Math.pow(10, len);
	//				len--;
	//			}
				System.out.println(j);
			}
	//		String str2 = Integer.toBinaryString(255);
	//
	//		System.out.println(Long.parseLong(str2));//11111111
			
		}
	}
/*
 * 9999:10011100001111
 * 	10001111111111
 * 				Long f=j;
				while(f>L) {
					System.out.println(k);
					f=j & ~ (1<<k);
					k++;
	//				ss.setCharAt(left, '0');;
					
	//				left++;
				}
 */
	public static void main1(String args[]) {
		Scanner st=new Scanner(System.in);
		Long L=st.nextLong();
		Long R=st.nextLong();
		Long num=(long) 1;
		int c=0;
		while(L<=R) {
			Long l=L;
			int max=0;
			while(l!=0) {
				if (l%2==1) {
					max++;
				}
				l=l/2;
//				System.out.print(l);
			}
//			System.out.println(max);
			if (max>c) {
				c=max;
				num=L;
			}
			L++;
			
		}
		System.out.print(num);
	}
}
