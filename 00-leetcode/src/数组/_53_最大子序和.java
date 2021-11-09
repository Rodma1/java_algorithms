package 数组;

public class _53_最大子序和 {
    public int maxSubArray(int[] nums) {
//遍历一遍数组就知道了
    	int pre=0,maxnum=nums[0];
    	for(int num :nums){
    		pre=Math.max(pre+num, num);
//    		取出最大的值
    		maxnum=Math.max(maxnum, pre);
    	}
    	return maxnum;
    }
}

/*
 * 解析： [-2,1,-3,4,-1,2,1,-5,4]
 * 第一次遍历:num=-2 pre=-2 max=-2
 * 第二次遍历:num=1 pre=1 max=1
 * 第三次遍历: -3		-1	1
 * 四	:	4		4	4
 * 五	：	-1		3 	max=4
 * 六	：	2		5	5
 * 七	:	1		6	6	
 */
