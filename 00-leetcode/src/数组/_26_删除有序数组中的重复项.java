package 数组;

public class _26_删除有序数组中的重复项 {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        // 双指针
        int left=0,right=1;
        while(right<nums.length){
            if(nums[left]==nums[right]){
                right++;
                continue;
            }
            nums[left+1]=nums[right];
            left++;
            right++;
        }
        // 由于数组中left的是从零开始的，所以最后还要加1
        return left+1;
    }
}
