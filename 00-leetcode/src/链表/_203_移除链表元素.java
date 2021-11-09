package 链表;
/*
 * https://leetcode-cn.com/problems/remove-linked-list-elements/
 * 4
 * 给你一个链表的头节点 head 和一个整数 val ，请你删除链表中所有满足 Node.val == val 
 * 的节点，并返回 新的头节点 。
 */
public class _203_移除链表元素 {
	 public ListNode removeElements(ListNode head, int val) {
		 
//		 迭代
		 if(head==null) return head;
//		 建立虚拟头节点
		 ListNode newHead= new ListNode(0);
//		 连接head
		 newHead.next=head;
//		 建立引用（指针）temp
		 ListNode temp=newHead;
//		 循环判断，直到到达链表底端停止
		 while(temp.next!=null) {
			 if(temp.next.val==val) {
//				 如果找到指定值，就将next替换
				 temp.next=temp.next.next;
			 }else {
//				 否则就是移动指针到下一个元素继续判断
				 temp=temp.next;
			 }
		 }
//		 返回新链表，不返回设定的虚拟头节点
		 return newHead.next;
	    }
}
