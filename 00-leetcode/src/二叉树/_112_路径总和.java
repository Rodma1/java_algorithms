package 二叉树;

import java.util.LinkedList;
import java.util.Queue;

public class _112_路径总和 {
//	可以采用广度优先搜索
    public boolean hasPathSum(TreeNode root, int targetSum) {
    	if (root==null) {
			return false;
		}
//    	定义存入节点的队列
        Queue<TreeNode> queNode = new LinkedList<TreeNode>();
//        入队顶元素
        queNode.offer(root);
        while (!queNode.isEmpty()) {
//        	出队
            TreeNode now = queNode.poll();
//            如果遍历到了底部
            if (now.left == null && now.right == null) {
                if (now.val == targetSum) {
                    return true;
                }
                continue;
            }
//            遍历左节点
            if (now.left != null) {
            	now.left.val+=now.val;
                queNode.offer(now.left);
            }
//           遍历右节点
            if (now.right != null) {
            	now.right.val += now.val;
                queNode.offer(now.right);
            }
        }
        return false;
    }
}
