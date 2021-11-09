package 数组;
/*
 * https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/
 */
public class _121_买卖股票的最佳时机 {
//	利用双指针，右指针指向的元素必须大于左指针的元素,否则左指针指向右指针的地方
    public int maxProfit(int[] prices) {
//    	定义指针和最大值
    	int left=0,right=1,ans_max=0;
    	while(right<prices.length) {
    		if (prices[right]>prices[left]) {
				ans_max=Math.max(ans_max,prices[right]-prices[left] );

			}
//    		否则左指针移到右指针位置指向小值
    		else {
    			left=right;
    		}
//    		
			right++;
    	}
    	return ans_max;
    	
    }
}
