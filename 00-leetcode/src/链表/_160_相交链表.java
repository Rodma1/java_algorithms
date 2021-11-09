package 链表;
/*
 * https://leetcode-cn.com/problems/intersection-of-two-linked-lists/
 * 这道题我之前用了哈希集合一下子就做出来了，这回用双指针遍历迭代o(n)复杂度试试
 * 思路：
 * 1. 定义两个指针nodeA,和nodeB
 * 2. 如果nodeA遍历到了最后面null,那么就指向headB
 * 3. 如果nodeB遍历到了最后面null,那么就指向headA
 * 4. 根据2和3的循环，最后就能遍历出来了,相当于多循环了一次，
 * 因为指针无法获取长度，从他们相等的长度去遍历，所以只能这样
 * 题目要求是返回第一个相交的值
 */
public class _160_相交链表 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //        如果其中一个为空就返回null
    	if (headA==null||headB==null) {
			return null;
		}
//    	定义指针
    	ListNode nodeA=headA,nodeB=headB;
//    	这里相交也包括null,所以没有相交就直接返回null
    	while(nodeA!=nodeB) {
    		nodeA=nodeA==null?headB:nodeA.next;
    		nodeB=nodeB==null?headA:nodeB.next;
    	}
    	return nodeA;
    }
}
