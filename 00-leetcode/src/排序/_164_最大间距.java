package 排序;

import java.util.Arrays;
/*
 * https://leetcode-cn.com/problems/maximum-gap/
 * 后面在做
 */
public class _164_最大间距 {
//	取巧法，直接sort，复杂度nlogn
    public int maximumGap1(int[] nums) {
    	if (nums.length<2) {
			return 0;
		}
    	Arrays.sort(nums);
    	int max=Integer.MIN_VALUE;
    	int len=nums.length-1;
    	int left=len-1,right=len;
    	while(left>=0) {
    		max=Math.max(max, nums[right--]-nums[left--]);
    	}
    	return max;
    }
//    不过题目要复杂度为n,那么我们要自己学排序算法了，桶排序或者基数排序是最好解法
//    桶排序,建议看220题
}
