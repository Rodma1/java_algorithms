package 数组;


public class _5863_统计特殊四元组 {
    public int countQuadruplets(int[] nums) {
        // 暴力解法
        int n = nums.length;
        int people = 0;
        for (int i = 0; i < n; i ++)
        {
            for (int j = i + 1; j < n; j ++)
            {
                for (int k = j + 1; k < n; k ++)
                {
                    for (int  f= k + 1; f < n; f ++)
                    {
                        if (nums[i] + nums[j] + nums[k] == nums[f])
                        {
                            people ++;
                        }
                    }
                }
            }
        }
        return people;
    	
    }
}
