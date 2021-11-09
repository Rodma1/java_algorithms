package 双指针;

import java.util.PriorityQueue;
/*
 * https://leetcode-cn.com/problems/squares-of-a-sorted-array/submissions/
 */
public class _977_有序数组的平方 {
//    通过优先队列解决
	public int[] sortedSquares(int[] nums) {
    	PriorityQueue<Integer> queue=new PriorityQueue<>();
    	for(int num:nums) {
    		queue.offer(num^2);
    	}
    	int i=0;
    	while(!queue.isEmpty()) {
    		nums[i]=queue.poll();
    		i++;
    	}
    	return nums;
    }
//	ps:效率太低了
	
//	通过双指针解决
    public int[] sortedSquares1(int[] nums) {
//    	定义双指针
    	int left=0,right=nums.length-1,index=right;
//    	设置一个空数组
    	int[] ans=new int[nums.length];
    	while(left<=right) {
//    		如果最右边大于最左边
            int i=nums[left]*nums[left],j=nums[right]*nums[right];
    		if (i<j) {
//    		将最大的数存入
				ans[index]=j;
				right--;
			}else {
				ans[index]=i;
				left++;
			}
    		index--;
    	}
    	return ans;
    }
}
