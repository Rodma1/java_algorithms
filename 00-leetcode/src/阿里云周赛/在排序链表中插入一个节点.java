package 阿里云周赛;

/*
 * https://tianchi.aliyun.com/oj/589132502606324130/633179267010859824
 */
public class 在排序链表中插入一个节点 {
    public ListNode insertNode(ListNode head, int val) {
//		定义一个链表
        ListNode ret = new ListNode(0);
//        指向head
        ret.next = head;
//        定义一个指针
        ListNode node = ret;
// 		while循环直到node指向空
        while(node != null){
//        	定义下一个节点的指针
            ListNode next = node.next;
//            如果node的下一个节点不为空，且值小于val，在遍历到下一个节点
            if(next != null && next.val < val){
            	node = node.next;
            }else{ //当node.val<val && next.val>val时代表找到插入节点的位置
//                定义一个val链表
            	ListNode newNode = new ListNode(val);
//                指向next后面的链表
            	newNode.next = next;
//            	node在指向newNode
                node.next = newNode;
//                插入完毕，跳出循环
                break;
            }
        }
        
        return ret.next;

    }
}
