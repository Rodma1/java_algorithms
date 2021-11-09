package 链表;
/*
 * 6
 * https://leetcode-cn.com/problems/middle-of-the-linked-list/
 * 给定一个头结点为 head 的非空单链表，返回链表的中间结点。如果有两个中间结点，则返回第二个中间结点。
 */
public class _876_链表的中间结点 {
	public ListNode middleNode(ListNode head) {
//		思想：快慢指针
		ListNode show=head;//慢指针
		ListNode fast=head;//快指针
//		slow 一次走一步，fast 一次走两步。那么当 fast 到达链表的末尾时，slow 必然位于中间。
		while(fast!=null&&fast.next!=null) {
			show=show.next;
			fast=fast.next.next;
		}
		return show;
    }
}
