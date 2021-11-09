package 数组;

import java.util.Arrays;
import java.util.Comparator;
/*
 * https://leetcode-cn.com/problems/third-maximum-number/
 * 思路：先排序，然后从后往前遍历，依次拿当前值跟最小值比较，如果小于就复制给min，知道取到第三个最小值
 */
public class _414_第三大的数 {
    public int thirdMax(int[] nums) {
//    	排序小到大
    	Arrays.sort(nums);
    	int len=nums.length-1;
//    	定义最小值
    	int min=nums[len];
//    	统计最小值交换次数
    	int j=0;
//    	for循环从后往前遍历
    	for(int i=len-1;i>=0;i--) {
//    		如果当前数比最小值小，那么就++
    		if (nums[i]<min) {
				j++;
				min=nums[i];
//				如果统计j到了第三次就直接返回
				if (j==2) {
	    			return nums[i];
				}
			}
    	}
//    	如果没有到第三次就返回最大值
    	return nums[len];
    }
}
