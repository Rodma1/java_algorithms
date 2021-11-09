package leetcode周赛;
/*
 * 给你一个 数字 字符串数组 nums 和一个 数字 字符串 target ，请你返回 nums[i] + nums[j] 
 * （两个字符串连接）结果等于 target 的下标 (i, j) （需满足 i != j）的数目。

 /
 */
public class _2023_连接后等于目标字符串的字符串对 {
    public int numOfPairs(String[] nums, String target) {
    	int num=0;
    	for(int i=0;i<nums.length-1;i++) {
    		for(int j=i+1;j<nums.length;j++) {
    			if (target.equals(nums[i]+nums[j])&&nums[i]!=nums[j]) {
					num++;
					if (target.equals(nums[j]+nums[i])) {
						num++;
					}
					continue;
				}
    			if (target.equals(nums[j]+nums[i])&&nums[i]!=nums[j]) {
					num++;
					if (target.equals(nums[i]+nums[j])) {
						num++;
					}
					continue;
				}
    		}
    	}
    	return num;
    }
}
