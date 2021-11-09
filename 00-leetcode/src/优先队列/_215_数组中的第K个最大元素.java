package 优先队列;

import java.util.Comparator;
import java.util.PriorityQueue;
/*
 * 1
 * https://leetcode-cn.com/problems/kth-largest-element-in-an-array/
 *这个题目和容易让很混淆，他要求是找出第k个最大数，而不是在k个数里面找出最大数
 */
public class _215_数组中的第K个最大元素 {
	public static int findKthLargest(int[] nums, int k) {
//		设置优先队列
		PriorityQueue<Integer> queue=new PriorityQueue<>(new Comparator<Integer>() {
			public int compare(Integer o1,Integer o2) {
				return o1-o2;//小顶堆
			}
		});
//		将前k个数入队
		for(int i=0;i<k;i++) {
			queue.add(nums[i]);
		}
		System.out.println(queue);
//		通过后面数比较大小是否满足替换栈顶的要求
		for (int i = k; i < nums.length; i++) {
			System.out.println(queue);
// 只要当前遍历的元素比堆顶元素大，堆顶弹出，遍历的元素进去
			if (nums[i]>queue.peek()) {
//				出队：由于这是优先队列,所以弹出来的肯定是最小的那个数
				queue.poll();
//				入队
				queue.offer(nums[i]);
			}
			
		}
//		返回堆顶元素就是第k个最大的数
		return queue.peek();
	}
	public static void main(String args[]) {
		int nums[]=new int[6];
		nums[0]=3;
		nums[1]=2;
		nums[2]=1;
		nums[3]=5;
		nums[4]=6;
		nums[5]=4;
		int k=3;
		int c=findKthLargest(nums, k);
		System.out.print(c);
	}
}
