package 链表;

import javax.xml.transform.Templates;

/*
 * 5
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/
 */
public class _83_删除排序链表中的重复元素 {
	 public ListNode deleteDuplicates(ListNode head) {
//		 建立一个虚拟头节点
	 	 ListNode newHead=new ListNode(0);
//	 	 如果为空或者只有一个元素那么直接返回
	 	 if (head==null ||head.next==null) return head;
//	 	 连接链表头节点
	 	 newHead.next=head;
//	 	 设置指针，指向头节点
	 	 ListNode tmp=newHead;
//	 	 循环遍历
	 	 while(tmp.next.next!=null) {
	 		 if(tmp.next.val==tmp.next.next.val) {
//		 			如果两个值相等那么直接指向下下个节点，不要下个节点
	 			 tmp.next=tmp.next.next;
	 		 }
	 		 else {
//	 			 指针指向下一个节点
	 			 tmp=tmp.next;
	 		 }
	 	 }
	 	 return newHead.next;
	  }
}
