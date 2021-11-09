package 优先队列;

import java.util.PriorityQueue;

/*
 * https://leetcode-cn.com/problems/smallest-k-lcci/
 */
public class 面试题_17_14_最小K个数 {
//	将数组里的整数存入优先队列，在poll输出前k个数
    public int[] smallestK(int[] arr, int k) {
//    	定义返回数组
    	int[] res=new int[k];
//    	定义优先队列
    	PriorityQueue<Integer> queue=new PriorityQueue<>();//默认小顶堆
//    	for循环遍历存入队列
    	for(int ar:arr) {
    		queue.add(ar);
    	}
//    	在通过for循环遍历
    	for(int i=0;i<k;i++) {
    		res[i]=queue.poll();
    	}
    	return res;
    }
}
