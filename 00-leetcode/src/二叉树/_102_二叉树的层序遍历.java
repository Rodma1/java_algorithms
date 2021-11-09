package 二叉树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 * 5
 * https://leetcode-cn.com/problems/binary-tree-level-order-traversal/
 */
public class _102_二叉树的层序遍历 {
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> res=new ArrayList<List<Integer>>();
		if (root==null) {
			return res;
		}
//		创建队列
		Queue<TreeNode> queue=new LinkedList<TreeNode>();
//		首先将根节点入队
		queue.offer(root);
//		如果队列不为空就一直循环
		while(!queue.isEmpty()) {
//			由于题目要求输出的格式是二维列表,所以我们在创建一个列表
			List<Integer> level=new ArrayList<Integer>();
//			获取队列大小
			int queue_size=queue.size();
//			循环取出原来队列里面的所有数
			for (int i = 0; i < queue_size; ++i) {
	//			出队
				TreeNode node=queue.poll();
				if (node.left!=null) {
					queue.offer(node.left);
				}
				if (node.right!=null) {
					queue.offer(node.right);
				}
				level.add(node.val);
			}
			res.add(level);
		}
		return res;
    }
}
