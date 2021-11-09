package 数组;

import java.util.HashMap;
/*
 * https://leetcode-cn.com/problems/two-sum/
 */
public class _1_两数之和 {
	public int[] twoSum(int[] nums,int target) {
//通过哈希表判断下一个target减去的值是否在哈希中，不在就存入
//		设置哈希表
		HashMap<Integer, Integer> map=new HashMap<>();
//		for循环遍历
		for(int i=0;i<nums.length;i++) {
//			如果target减去num不在数组中就存入
			if (!map.containsKey(target-nums[i])) {
				map.put(nums[i], i);
			}else {
				return new int[] {map.get(target-nums[i]),i};
			}
		}
		return new int [0];
		
	}
}
