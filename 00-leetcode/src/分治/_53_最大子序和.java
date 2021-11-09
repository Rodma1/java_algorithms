package 分治;
/*
 * 分治跟归并排序思想差不多
 * https://leetcode-cn.com/problems/maximum-subarray/
 */
public class _53_最大子序和 {

//	分治:左边遍历，右边遍历，中间遍历
    public int maxSubArray(int[] nums) {
//    	如果为空或长度为0就返回0
    	if (nums==null||nums.length==0) {
			return 0;
		}

    	return maxSubArray(nums,0,nums.length);
    	
    }
//    通过递归思想遍历左右
    public int maxSubArray(int[] nums,int start,int end) {
//    	如果元素只有1个或0个就结束递归
    	if (end-start<2) {
			return nums[start];
		}
//    	获取中间节点
    	int pivot=(start+end)>>1;
//    	也许可能在中间的,我们就从中间往左右两边相加，选出最大的子序列
    	
    	int leftmax=nums[pivot-1];//先获取第一个数
    	int leftpre=leftmax;
    	for(int i=pivot-2;i>=start;i--) {//往左边加
//			不断获取数和前面的总值相加，来比较
    		leftpre+=nums[i];
//    		获得序列的最大值
    		leftmax=Math.max(leftmax, leftpre);
    	}
//    	获取左边
    	int rightmax=nums[pivot];//获取左边第一个数
    	int rightpre=rightmax;
    	for(int i=pivot+1;i<end;i++) {
    		rightpre+=nums[i];
    		rightmax=Math.max(rightmax, rightpre);
    	}
//    	左右相加获取中间
//    	int max=leftmax+rightmax;
//    	递归左,区间是左闭右开[start,pivot)
//    	leftmax=maxSubArray(nums,start,pivot);
//    	递归右,区间也是左闭右开[pivot,end)
//    	rightmax=maxSubArray(nums,pivot,end);
    	
//    	比较输出
    	return Math.max(leftmax+rightmax,Math.max(maxSubArray(nums,start,pivot),maxSubArray(nums,pivot,end)));

    }
}
