package 二叉树;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/*
 * https://leetcode-cn.com/problems/kth-smallest-element-in-a-bst/
 * 求第k个最小元素用优先队列
*/
public class _230_二叉搜索树中第K小的元素 {
    public int kthSmallest(TreeNode root, int k) {
//    	创建优先队列
    	PriorityQueue<Integer> queue= new PriorityQueue<>();
//    	定义队列
    	Queue<TreeNode> queue2= new LinkedList<TreeNode>();
    	
//    	定义指针
//    	TreeNode node=root;
    	queue2.add(root);
    	while(!queue2.isEmpty()) {
    		TreeNode node=queue2.poll();
            
    		
    		queue.add(node.val);

    		if (node.left!=null) {
    			queue2.add(node.left);
			}
    		if (node.right!=null) {
    			queue2.add(node.right);
			}
    		
    	}
    	while(k--!=1) {
    		queue.poll();
    	}
    	return queue.peek();
    }
}
