package 双指针;

public class _19_删除链表的倒数第N个结点 {
//	通过双指针，首先遍历到第n个数,然后在创建另一个指针从这第n数开始遍历就能找到他的倒数
    public ListNode removeNthFromEnd(ListNode head, int n) {
    	// 解析案列:1-2-3-4-5  n=2
//    		创建一个新链表
    	ListNode ret=new ListNode(0,null);
//    	创建新指针指向head和ret
    	ListNode first=head;//指向1
    	ret.next=head;//null-1-2-3-4-5 
    	ListNode second=ret;//指向null
    	
//    	先循环到第n个数
    	for(int i=0;i<n;i++) {
    		first=first.next;
    	}
//    	first遍历完后指向3
    	
//    	如果first为null循环结束
    	while(first!=null) {
//    		遍历ret链表从first开始
    		second=second.next;
    		first=first.next;   		
    	}
//    	循环完后second指向3,这里遍历了三次
    	second.next=second.next.next;//最后在用3指向5
    	return ret.next;
    }
}

 
