package 哈希表;

import java.util.HashSet;
import java.util.Set;

import javax.lang.model.element.Name;

/*
 * 3
 * https://leetcode-cn.com/problems/happy-number/
 */

//使用哈希表解决问题，通过题目我们可以判断，如果进入死循环就返回false，如果最后输出1就返回True，而且可以判断出无法达到无穷大
public class _202_快乐数 {
	public static boolean isHappy(int n) {

//		System.out.println(num);82
//		设置哈希集合，用于存放num
		Set<Integer> nums=new HashSet<Integer>();
//		通过while循环判断num是否等于1或者num是否存在于哈希表中
		while(n!=1&&!nums.contains(n)) {
			nums.add(n);
			n =count(n);
		}
//		循环结束判断n是否等于1
		return n==1;
    }
	public static int count(int n) {
		int num=0,a=0;
//		我们根据题目将整数一个个分开乘积，最后相加输出
		while(n>0) {
//			取出余数
			a=n%10;
//			更新
			n=n/10;
			num+=a*a;
		}
		return num;
	}
	public static void main(String args[]) {
		boolean c=isHappy(19);
		System.out.print(c);
	}
}
