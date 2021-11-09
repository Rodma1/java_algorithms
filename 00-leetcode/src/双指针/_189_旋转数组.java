package 双指针;
/*
 * https://leetcode-cn.com/problems/rotate-array/
 */
public class _189_旋转数组 {
    public void rotate(int[] nums, int k) {
        k%=nums.length;
    	int left=0,right=nums.length-1;
//    	第一轮翻转
    	reverse(nums, left, right);
//		第二轮翻转是[0,k-1] 
    	reverse(nums, left, k-1);
//    	第三轮翻转是[k,right]
    	reverse(nums, k, right);
    }
  //双指针翻转数组
    public void reverse(int [] nums,int left,int right) {
    	while(left<right) {
        	int temp=nums[left];
        	nums[left]=nums[right];
        	nums[right]=temp;
        	left++;
        	right--;
    	}
    }
}
/*
 * 比如数组 123456 k=3
 * 第一轮翻转:6 5 4 3 2 1
 * 第二轮翻转是[0,k-1]: 4 5 6 3 2 1
 * 第三轮翻转是[k,right]:4 5 6 1 2 3 
 *  
 */