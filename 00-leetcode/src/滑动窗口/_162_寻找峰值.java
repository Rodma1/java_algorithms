package 滑动窗口;
/*
 * https://leetcode-cn.com/problems/find-peak-element/
 * 滑动窗口思想
 */
public class _162_寻找峰值 {
    public int findPeakElement(int[] nums) {
//    	如果传入的值小于2，直接返回零
    	if (nums.length<2) {
    			return 0;
		}
//    	定义返回值 
    	int re=0;
    	//    	定义一个双指针
    	int left=0,right=1;
    	while(right<nums.length) {
//    		如果前一个数小于后一个数，那么符合条件
    		if (nums[left]<nums[right]) {
//    			如果已经越过数组下标，那么就返回,比如[1,2]这种情况，就返回1
    			if (right+1==nums.length) {
					return right;
				}
//    			否则就是在判断后一个数是否符合条件
    			else if (nums[right+1]<nums[right]) {
    				return right;
				}
				
			}
//    		窗口在向前移动
    		left++;
    		right++;
    	}
    	return re;
    }
}
