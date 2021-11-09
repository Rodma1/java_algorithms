package 双指针;

import java.lang.reflect.Array;
import java.util.Arrays;
/*
 * https://leetcode-cn.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores/
 */
public class _5854_学生分数的最小差值 {
    public int minimumDifference(int[] nums, int k) {
//    	设置左右指针
    	int left=0,right=k-1,ans=0;
//    	先排序
    	Arrays.sort(nums);
    	while(right<nums.length) {
    		
    		int num=nums[right]-nums[left];
    		right++;
    		left++;
    		ans=Math.min(ans, num);
    	}
    	return ans;
    }
}
