package 数学;
/*
 * https://leetcode-cn.com/problems/minimum-moves-to-equal-array-elements/
 */
public class _453_最小操作次数使数组元素相等 {
    public int minMoves(int[] nums) {
    	int sum=0;
//    	获取最小值
    	int min=Integer.MAX_VALUE;
    	for(int num:nums) { 
    		if (min>num) {
				min=num;
			}
    	}
//    	获取最小值后就遍历相减
    	for(int num:nums) { 
    		sum+=num-min;
    	}
    	return sum;
    	
    }
}
