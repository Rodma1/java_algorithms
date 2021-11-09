package 数组;
/*
 * 意思是关键字递增序排列，但是并非单调递增（因为有重复的关键字）从小到大或者允许中间有相等
 * https://leetcode-cn.com/problems/merge-sorted-array/
 */
public class _88_合并两个有序数组 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
//    		逆向双指针
    	int right1=m-1,right2=n-1;
    	int tail=m+n-1;
    	int cur;
//    	循环遍历直到两个数组遍历完成，从后往前遍历
    	while(right1>=0||right2>=0) {
//    		如果nums1遍历完,那么继续遍历nums2
    		if (right1==-1) {
				cur=nums2[right2--];
			}
//    		否则如果nums2遍历完,那么继续遍历nums1
    		else if (right2==-1) {
				cur=nums1[right1--];
			}
//    		否则如果都没遍历完，那么比较那个大就遍历那个
    		else if (nums1[right1]>nums2[right2]) {
				cur=nums1[right1--];
			}else {
				cur=nums2[right2--];
			}
//    		将判断的数字倒序存入数组
    		nums1[tail--]=cur;
    	}
    	
    }
}
