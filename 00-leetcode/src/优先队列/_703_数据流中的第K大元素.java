package 优先队列;

import java.util.PriorityQueue;


/*
 * 3
 * https://leetcode-cn.com/problems/kth-largest-element-in-a-stream/
 */
public class _703_数据流中的第K大元素 {
//	采用优先队列
	PriorityQueue<Integer> queue;
	int k;
	public  _703_数据流中的第K大元素(int k,int[] nums) {
		queue=new PriorityQueue<>();
		this.k=k;
//		通过for循环遍历元素存入到队列中
		for(int num:nums) {
//			调用函数
			add(num);
		}
		
	}
//	返回值
	public  int add(int val) {
//		如果增加值那么直接入队就可以了
		queue.offer(val);
//		如果队列大于设定的k数,直接出队最小的
		if (queue.size()>k) {
			queue.poll();
		}
//		返回堆顶元素
		return queue.peek();
	}


}


//int param_1 = obj.add(val);