package 数学;
/*
 * https://leetcode-cn.com/problems/find-n-unique-integers-sum-up-to-zero/
 * 解题思路:分别取一个正数和一个负数
 * 比如n=4:[-1,1,-2,2]
 * 如果n是偶数，上面条件成立
 * 如果n是奇数，那么我们还得再最后面加个零
 * 比如5:[-1,1,-2,2,0]
 */
public class _1304_和为零的N个唯一整数 {
    public int[] sumZero(int n) {
        int[] sum=new int[n];
        int left_sum=-1,right_sum=1;
        int left=0,right=1;
        
        while(right<n) {
        	sum[left]=left_sum--;
        	sum[right]=right_sum++;
        	
        	left+=2;
        	right+=2;
        }
    	if (n%2==1) {
			sum[n-1]=0;
		}
    	return sum;
    }
}
