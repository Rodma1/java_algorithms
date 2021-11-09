package 水题;
/*
 * https://leetcode-cn.com/problems/find-greatest-common-divisor-of-array/
 */
public class _1979_找出数组的最大公约数 {
    public int findGCD(int[] nums) {
    	int max=0,min=1001;
//    	循环找最大值
    	for(int num:nums) {
//    		找出最大值
    		if (max<num) {
				max=num;
			}
//    	找出最小值
    		if (min>num) {
				min=num;
			}
    	}
//    	通过while循环找出公约数
    	while(min!=0) {
//    		得到余数，比如7%3=1
    		int temp=max%min;
//    		这时候最小min就变成最大的了，max=3
    		max=min;
//    		min等于余数还是最小的min=1
    		min=temp;
//    		最后在循环一边3%1=0，max=1，min=0,返回1,1就是他们的最大公约数
    	}
    	return max;
    }
}
