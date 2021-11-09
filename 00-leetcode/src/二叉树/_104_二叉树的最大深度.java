package 二叉树;

import java.util.LinkedList;
import java.util.Queue;

/*
 * 6
 * https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/
 */
public class _104_二叉树的最大深度 {
//	递归:使用深度优先遍历（从下到上）,先遍历左子树,在遍历右子树
	public int maxDepth(TreeNode root) {
			if (root==null) {
				return 0;
			}
			int leftHeight=maxDepth(root.left);
			int rightHeight=maxDepth(root.right);
//			比较左右子树那个深度大,将那个大的子树加一,不断递归
			return Math.max(leftHeight,rightHeight)+1;
    }
//	迭代：广度优先遍历（从上到下），左右子树同时遍历，更层序遍历差不多
	public int maxDepth2(TreeNode root) {
		if (root==null) {
			return 0;
		}
//		创建一个队列
		Queue<TreeNode> queue=new LinkedList<TreeNode>();
//		首先将根节点入队
		queue.offer(root);
//		设置深度
		int ans=0;
		while(!queue.isEmpty()) {

//			获取队列大小
			int queue_size=queue.size();
//			遍历之前队中的数据
			for(int i=0;i<queue_size;i++) {
//出队
				TreeNode node=queue.poll();
//				获取左右子树
				if (node.left!=null) {
					queue.offer(node.left);
				}
				if (node.right!=null) {
					queue.offer(node.right);
				}
			}
			ans++;
		}
		return ans;
	}
}
