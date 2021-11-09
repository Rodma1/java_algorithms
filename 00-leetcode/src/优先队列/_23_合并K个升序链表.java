package 优先队列;

import java.util.PriorityQueue;

/*
 * https://leetcode-cn.com/problems/merge-k-sorted-lists/
 */
public class _23_合并K个升序链表 {
    public ListNode mergeKLists(ListNode[] lists) {
//    	新建一个链表
    	ListNode head=new ListNode(0,null);
//    	建立指针
    	ListNode node=head;

//    	创建队列
    	PriorityQueue<Integer> queue =new PriorityQueue<>();
//    	for循环取出数组中的队列，在通过while循环取出链表中的值存入队列中
    	for(ListNode list:lists) {
    		while(list!=null) {
    			queue.offer(list.val);
//    			使用指针连接后面的list，最后就连接好了head
    			node.next=list;
    			node=node.next;
    			list=list.next;
    		}
    	}
//    	重新设置指针
    	ListNode node1=head.next;
//    	在通过循环取出队列中的值修改链表中的值    	
    	while(!queue.isEmpty()) {
    		int num=queue.poll();
    		System.out.print(num);
    		node1.val=num;
    		node1=node1.next;
    	}
    	return head.next;
    }
}
