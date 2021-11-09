package 二叉树;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class _653_两数之和_IV_输入_BST {
    public boolean findTarget(TreeNode root, int k) {

//    	解题思路:通过哈希和层序遍历的思想
    	Set<Integer> set=new HashSet<>();
//    	设置队列
    	Queue<TreeNode> queue=new LinkedList<TreeNode>();
//    	入队
    	queue.offer(root);
    	while(!queue.isEmpty()) {
//    		出队
    		TreeNode node=queue.poll();
    		if (node==null) {
				continue;
			}
//    		判断减去的数是否存在
    		if (set.contains(k-node.val)) {
				return true;
			}
//    		存入集合中
    		set.add(node.val);
//    		存入队列中
    		queue.offer(node.left);
    		queue.offer(node.right);
    		
    	}
    	return false;
    }
}
