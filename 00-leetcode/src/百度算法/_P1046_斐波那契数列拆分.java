package 百度算法;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.lang.model.util.ElementFilter;
import javax.swing.text.AbstractDocument.BranchElement;

public class _P1046_斐波那契数列拆分 {
	public static int fib(int n) {
		//如果小于等于1直接返回就行0，1
    	if (n<=1) {
			return n;
		}
//		通过双指针方法
		int sum=0,left=0,right=1;
//		通过for循环遍历
		for(int i=0;i<n;i++) {
			sum=left+right;
			left=right;
			right=sum;
		}
		
		return sum;
	}
	public static int getNum(List<Double> keys, double m) {
////		获取他的长度
//        int n = keys.size();
//        double nbit = 1 << n;
//        double in;
//        int ans=0;
//        List<Double> list = new ArrayList<Double>();
//        for (int i = 0; i < nbit; i++) {
//            in = 0;
//            list.clear();
//            for (int j = 0; j < n; j++) {
//                int tmp = 1 << j; // 由0到n右移位
//                if ((tmp & i) != 0) { // 与运算，同为1时才会是1
//                    in += keys.get(j);
//                    list.add(keys.get(j));
//                }
//            }
//            
//            if (in == m) {
//            	System.out.println(list);
//                ans++;
//            }
//        }
//        
//        return ans;
		
//		获取长度
		int n=keys.size();
		int a;
		int ans=0;
//		设定两个指针
		int right=n-1,left=0;
		double sum=0;
		double sum2=0;
		if (m==0||m==1||m==2) {
			return 1;
		}
		if (keys.get(right)==m) {
			ans++;
			left=right-1;
			int s=0;
			if (n%2==0) {
				a=1;
			}else {
				a=0;
			}
			while(left>a) {
				
				sum=keys.get(left)+keys.get(--left);
				System.out.print(sum);
				if (sum==keys.get(right)) {
					ans++;
					right=right-2;
				}
				left=right-1;
			}
			return ans;
		}else {
//				for循环遍历指针找到两个数
			while(left<right) {
				if (keys.get(left)+keys.get(right)<m) {
					left++;
				}else if (keys.get(left)+keys.get(right)>m) {
					right--;
				}else {
					ans++;
					int left1=right-1;
					int s=0;
					if (n%2==0) {
						a=1;
					}else {
						a=0;
					}
					while(left1>left) {
						
						sum=keys.get(left1)+keys.get(--left1);
						System.out.print(sum);
						if (sum==keys.get(right)) {
							ans++;
							right=right-2;
						}
						left1=right-1;
					}
					right=left;
					left=right-1;
					while(left>0) {
						
						sum=keys.get(left)+keys.get(--left);
						System.out.print(sum);
						if (sum==keys.get(right)) {
							ans++;
							right=right-2;
						}
						left=right-1;
					}
					return ans;
				}
				
				
			}
		}
		return ans;
	}
	public static void main(String args[]) {
		Scanner st=new Scanner(System.in);
		double m=st.nextDouble();
		
//		定义一个数组存放元素
		List<Double> keys = new ArrayList<Double>();
		double a=0;
		for(int i=1;i<=m;i++) {
			a=fib(i);
			if (a>m) {
				break;
			}
			keys.add(a);
		}
		System.out.println(keys);
		int ans=getNum(keys, m);
		System.out.print(ans);
	}
	
}
