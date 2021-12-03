package 数组;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/maximize-sum-of-array-after-k-negations/
 * 抓住一个最小的那个数就可以
 */
public class _1005_K次取反后最大化的数组和 {
    public int largestSumAfterKNegations(int[] nums, int k) {
        int sum = 0;
//        排序
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (k > 0 && nums[i] < 0) {
                nums[i] += -nums[i];
                k--;
            }
            sum += nums[i];
        }

//        如果k是偶数直接返回，因为我们可以在同一个数上将他抵消抵消了
        if (k % 2 == 0) {
            return sum;
        }
//        如果k还剩下奇数个
        // 排序，找到第一个最小值
        Arrays.sort(nums);
//        返回减去第一个数的两倍,因为上面sum已经加上过它le
        return sum-2*nums[0];

    }
}
