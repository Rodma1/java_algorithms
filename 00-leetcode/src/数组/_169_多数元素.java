package 数组;


import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/majority-element/
 */
public class _169_多数元素 {
    /**
     * 排序+遍历
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {
//        如果只有一个数那么直接返回
        if (nums.length==1){
            return nums[0];
        }
        Arrays.sort(nums);
        int max1=0,max=-1,num=0;
        for (int i=1;i<nums.length;i++){
//            如果当前数和前一个数不相等就比较数量
            if (nums[i]!=nums[i-1]||i==nums.length-1){
                if (max1>max){
                    max=max1;
                    num=nums[i-1];
                }
                max1=0;
            }
            max1++;
        }
        return num;
    }
    /**
     * 排序 nlog(n)
     * 由于众数出现的频率大于n/2,所以在排序之后众数必存在于下标[n/2]处(本题默认数组中是一定存在众数的，所以返回下标[n/2]可行)
     */
    public int majorityElement1(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
    /**
     * Boyer-Moore投票算法
     * 投票法，众数个数至少比非众数多一，把COUNT加减当作一个众数抵消掉一个非众数，剩下的一定是众数
     * 遇到相同的数，就投一票，遇到不同的数，就减一票，最后还存在票的数就是众数
     */
    public int majorityElement2(int[] nums) {
//        票数
        int count=0;
        Integer sum=null;
//        for循环遍历
        for (int num:nums){
//            如果投票数变成零，那么就换另一个num来进行投票
            if (count==0){
                sum=num;
            }
//            判定投票数是加还是减
            count+=(sum==num)?1:-1;
        }
        return sum;
    }
}
