package 链表;

/*https://leetcode-cn.com/problems/delete-node-in-a-linked-list/
 * 删除某个链表中给定的（非末尾）节点。传入函数的唯一参数为 要被删除的节点 。
 */

 
public class _237_删除链表中的节点 {
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	public void deleteNode(ListNode node) {
//		将下一个节点值替换要删除的节点
		node.val=node.next.val;
//		将下一个节点的指针替换要删除的节点
		node.next=node.next.next;
	}
}
