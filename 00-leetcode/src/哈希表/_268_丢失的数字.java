package 哈希表;

import java.util.HashSet;
import java.util.Set;

/*
 * https://leetcode-cn.com/problems/missing-number/
 */
public class _268_丢失的数字 {
	public int missingNumber(int[] nums) {
//		设置一个哈希函数
		Set<Integer> map=new HashSet<>();
//		for循环存入哈希表
		for(int num:nums) {
			map.add(num);
		}
//		for循环比较
		for(int i=0;i<nums.length;i++) {
			if (map.contains(i)) {
				return i;
			}
		}
		return -1;
	}
}
