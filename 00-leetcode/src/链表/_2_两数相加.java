package 链表;
/*
 * https://leetcode-cn.com/problems/add-two-numbers/
 * 我的问题：这道题我用了太多if和else，看了官方题解发现还可以简化，后面再慢慢分析，不过思路差不多
 * 1. 如果两个链表不为空就相加遍历，如果相加有进制就存在carry里面让后面节点加上就可以了
 * 2. 如果一个链表遍历完了那就遍历另一个链表，也得要判断carry是否为1
 */
public class _2_两数相加 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//    	定义一个新的节点
    	ListNode res=new ListNode(0);
    	ListNode pivot=res;
//    	定义进位数不是0就是1
    	int  carry=0;
//    	他们两个相加的值
    	int val=0;
//    	通过while循环遍历,直到l1或l2都为空
    	while(l1!=null||l2!=null) {
    		
//    		如果l1为空，那么只遍历l2
    		if (l1==null) {
        		if (carry==1) {
            		val=l2.val+1;
            		carry=0;
    			}else {
    				val=l2.val;
    			}
//        		如果val大于等于10,说明进制
        		if (val>=10) {
        			pivot.next=new ListNode(val%10);
    				carry=1;
    			}else {
    				pivot.next=new ListNode(val);
    			}
        		pivot=pivot.next;
				l2=l2.next;
				continue;
			}
//    		如果l2为空,那么只遍历l1
    		if (l2==null) {
        		if (carry==1) {
            		val=l1.val+1;
            		carry=0;
    			}else {
    				val=l1.val;
    			}
//        		如果val大于等于10,说明进制
        		if (val>=10) {
        			pivot.next=new ListNode(val%10);
    				carry=1;
    			}else {
    				pivot.next=new ListNode(val);
    			}
        		pivot=pivot.next;
				l1=l1.next;
				continue;
			}
//    		如果两个都不为空，就相加
//    		val=l1.val+l2.val;
//    		然后判断carry是否是1,是1就加1，和val是否大于10，大于就%10
    		if (carry==1) {
        		val=l1.val+l2.val+1;
        		carry=0;
			}else {
				val=l1.val+l2.val;
			}
//    		如果val大于等于10,说明进制
    		if (val>=10) {
    			pivot.next=new ListNode(val%10);
				carry=1;
			}else {
				pivot.next=new ListNode(val);
			}
//    		在往下移
    		pivot=pivot.next;
    		l1=l1.next;
    		l2=l2.next;
    	}
    	if (carry==1) {
    		pivot.next=new ListNode(1);
		}
    	return res;
    }
}
