package 数组;

public class _27_移除元素 {
    public int removeElement(int[] nums, int val) {
        // 双指针
        int len=nums.length;
        int left=0,right=0;
        while(right<len){
            if(nums[right]!=val){
                nums[left++]=nums[right];
            }
            right++;
        }
        return left;
    }
}
