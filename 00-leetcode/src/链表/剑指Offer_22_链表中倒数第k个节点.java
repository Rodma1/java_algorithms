package 链表;
/*
 * https://leetcode-cn.com/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/
 */
public class 剑指Offer_22_链表中倒数第k个节点 {
//    使用顺序查找，假设链表长度是n，第k个节电就是链表的第n-k个节电
	public ListNode getKthFromEnd(ListNode head, int k) {
//    	定义一个指针,指向头节点
		ListNode node=head;
		int n=0;
//		通过for循环获取链表长度
		for(;node!=null;node=node.next) {
			n++;
		}
//		在for循环遍历一遍
//		只要我们指针指向第k个元素后的节点，那么就可以直接返回
		for(node=head;n>k;n--) {
			node=node.next;
		}
//		返回第k个元素后的节点
		return node;
    }
}
