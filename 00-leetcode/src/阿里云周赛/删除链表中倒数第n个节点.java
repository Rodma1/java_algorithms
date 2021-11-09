package 阿里云周赛;

public class 删除链表中倒数第n个节点 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // write your code here
        //    		创建一个新链表
    	ListNode ret=new ListNode(0);
//    	创建新指针指向head和ret
    	ListNode first=head;
    	ret.next=head;
    	ListNode second=ret;
    	
//    	先循环到第n个数
    	for(int i=0;i<n;i++) {
    		first=first.next;
    	}
//    	如果first为null循环结束
    	while(first!=null) {
//    		遍历ret链表从first开始
    		second=second.next;
    		first=first.next;
    		
    	}
    	second.next=second.next.next;
    	return ret.next;
    }
}
