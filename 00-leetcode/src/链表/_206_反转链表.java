package 链表;
/*
 * https://leetcode-cn.com/problems/reverse-linked-list/
 * 给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
 */
public class _206_反转链表 {
	
//	递归
	public ListNode reverseList(ListNode head) {
//		防止递归死循环
		if (head==null || head.next==null) return head;
//		通过递归从第二个节点反转全部,通俗点就是将第二个节点的指针放到最后一个节点处
		ListNode newHead=reverseList(head.next);
//		递归完毕，head又回到第二个节点处，在将第一个节点连接
		head.next.next=head;
//		最后设置为空
		head.next=null;
		
		
		return newHead;
    }
	
//非递归,迭代
	public ListNode reverseList1(ListNode head) {
		if (head==null || head.next==null) return head;
		
		ListNode newHead=null;
		while(head!=null) {
//			tmp指定的是下一个指针
			ListNode tmp=head.next;
			head.next=newHead;
			newHead=head;
//			head指向下一个节点
			head=tmp;
		}
		return newHead;
	}
	
////	测试
//	public static void main(String[] args) {
//		ListNode head=new ListNode(5);
//		ListNode head1=new ListNode(1);
//		head.next=head1;
//	}
} 
