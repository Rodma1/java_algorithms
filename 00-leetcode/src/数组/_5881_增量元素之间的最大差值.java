package 数组;

public class _5881_增量元素之间的最大差值 {
    public int maximumDifference(int[] nums) {
    	int left=0,right=1;
    	int max=-1;
    	while(left<right) {
    		right=left+1;
    		while(right<nums.length) {
    			if (nums[left]<nums[right]) {
    				int n=nums[right]-nums[left];
        			if (n>max) {
    					max=n;
    				}
				}
    			right++;
    		}
    		left++;
    	}
    	return max;
    }
}
