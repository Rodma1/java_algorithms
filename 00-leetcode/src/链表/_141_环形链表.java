package 链表;

/*
 * https://leetcode-cn.com/problems/linked-list-cycle/
 * 给定一个链表，判断链表中是否有环。如果链表中存在环，则返回 true 。 否则，返回 false 。
 * 快慢指针思想，比如慢指针会走一步，快指针会走两步
 * 复杂度:首先看数据规模，大概是o(n)
 */
public class _141_环形链表 {
	public boolean hasCycle(ListNode head) {
	        if(head==null || head.next==null) {
	        	return false;
	        }
//	        慢指针
	        ListNode show=head;
//	        快指针
	        ListNode fast=head.next;
//	        如何终止while循环？如果不是环形说明fast最后为null
	        while (fast!=null && fast.next!=null) {

	        	show=show.next;
//	        快指针走两步	
	        	fast=fast.next.next;
//	        	如果快慢指针相等就说明是环形
	        	if (show==fast) return true;
	        }
	        return false;
	    }
}
