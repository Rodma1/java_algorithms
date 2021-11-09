package 二叉树;

import java.util.LinkedList;
import java.util.Queue;

import javax.xml.soap.Node;

public class _700_二叉搜索树中的搜索 {
//	根据广度优先搜索遍历思想
    public TreeNode searchBST(TreeNode root, int val) {
    	if (root==null) {
			return null;
		}
//    	定义队列,后进先出
    	Queue<TreeNode> queue=new LinkedList<>();
//    	入队根节点
    	queue.add(root);
    	while(!queue.isEmpty()) {
//    		出队
    		TreeNode node=queue.poll();
    		if (node.val==val) {
				return node;
			}
    		if (node.left==null&&node.right==null) {
				continue;
			}
    		if (node.left!=null) {
    			queue.add(node.left);
			}
    		if (node.right!=null) {
//        		入队        		
        		queue.add(node.right);
			}

    		
    	}
    	return null;
    	
    }
    public TreeNode searchBST1(TreeNode root, int val) {
        while (root != null && val != root.val)
            root = val < root.val ? root.left : root.right;
          return root;
    	
    }
}
