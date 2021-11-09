package 哈希表;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/*
 * 1
 * https://leetcode-cn.com/problems/intersection-of-two-linked-lists/
 */
public class _160_相交链表 {
//	通过哈希集合解决题目
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        设置哈希集合
		Set<ListNode> res=new HashSet<ListNode>();
//		设置头节点
		ListNode node=headA;
//		while循环将节点存入集合中
		while(node!=null) {
			res.add(node);
			node=node.next;
		}
//		通过循环headB查看是否有值在集合中，如果有就直接返回
		node=headB;
		while(node!=null) {
			if (res.contains(node)) {
				return node;
			}
			node=node.next;
		}
//如果没有相交的值就返回null
		return null;
		
	}	
}
