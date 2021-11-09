package 链表;
/*
 * https://leetcode-cn.com/problems/merge-two-sorted-lists/
 */
public class _21_合并两个有序链表 {
//	通过双指针方法遍历，且优先遍历第一个链表
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//    	定义指针
    	ListNode node1=l1;
    	ListNode node2=l1;
//    	定义新的链表
    	ListNode l3=new ListNode(0);
    	l3=null;
    	ListNode node3=l3;
//    	通过while循环直到遍历到l1或l2结尾
    	while(node1!=null || node2!=null) {
    		if (node1!=null && node2!=null) {
				if (node1.val<=node2.val) {
					node3.next=node1;
//					指针指向下一个节点
					node3=node3.next;
					node1=node1.next;
				}else {
					node3.next=node2;
					node3=node3.next;
					node2=node2.next;
				}
			}
    		else if (node1!=null) {
				while(node1!=null) {
					node3.next=node1;
					node3=node3.next;
					node1=node1.next;
				}
			}else {
				while(node2!=null) {
					node3.next=node2;
					node3=node3.next;
					node2=node2.next;
				}
			}
    	}
    	return l3;
    	
    }
}
