package 链表;
/*
 * https://leetcode-cn.com/problems/partition-list/
 * 刚开始想法：
 * 1. 遍历寻找x最前面的大值max，如果大于3，
 * 2. 如果 大于3那么位置不变
 * 3. 如果小于3就放到max的前面
 * 如果这是数组那就很简单，不过这是链表 
 * 写到int定义max的想法：
 * 1. 定义两个列表
 * 2. 大于3的放在小链表，否则放在大链表
 * 3. 最后将他们合起来输出就可以了
 * 我们可以定义两个链表来存储他的小值和大值，最后在合一起
 */
public class _86_分隔链表 {
    public ListNode partition(ListNode head, int x) {
//    	如果链表为空就直接返回或只有一个就直接返回
    	if (head==null||head.next==null) {
			return head;
		}
//    	这里定义两个链表
    	ListNode listmin=new ListNode(0);
    	ListNode listmax=new ListNode(0);
//    	定义指针
    	ListNode pivotmin=listmin;
    	ListNode pivotmax=listmax;
//    	循环遍历链表
    	while(head!=null) {
//    		如果<于3,就放到listmin链表里面
    		if (head.val<x) {
//    			这里要写pivotmin.next，不能写pivotmin,因为你要指向下一个
    			pivotmin.next=new ListNode(head.val);
    			pivotmin=pivotmin.next;
			}else {
//				这里是保存的是大数
				pivotmax.next=new ListNode(head.val);
				pivotmax=pivotmax.next;
			}
    		head=head.next;
    	}
//    	最后将他们合起来,listmax.next加上next是因为要去除第一个零
        pivotmin.next=listmax.next;
    	return listmin.next;
    }
}
