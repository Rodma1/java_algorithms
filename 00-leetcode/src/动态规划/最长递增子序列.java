package 动态规划;

/**
 * https://leetcode-cn.com/problems/longest-increasing-subsequence/
 * 找到最优子结构
 */
public class 最长递增子序列 {
    public int lengthOfLIS(int[] nums) {
//        如果数组长度为0就直接返回0
        if (nums.length==0){
            return 0;
        }
//        设置数组保存每一个序列的长度
        int[] dp=new int[nums.length];
//        设置边界
        dp[0]=1;
//        初始化最大值
        int maxlen=1;
//        自底向上遍历
        for (int i=1;i<nums.length;i++){
            dp[i]=1;
//            查找每一个序列的长度
            for (int j=0;j<i;j++){
//                如果当前的i元素大于j元素，那么序列就加1
                if (nums[i]>nums[j]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
//            在在比较最大值
            maxlen=Math.max(maxlen,dp[i]);
        }

        return maxlen;
    }
}
