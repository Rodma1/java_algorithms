package 二叉树;

import java.util.LinkedList;
import java.util.Queue;

/*
 * https://leetcode-cn.com/problems/symmetric-tree/
 * 首先从队列中拿出两个节点(left 和 right)比较
 * 将 left 的 left 节点和 right 的 right 节点放入队列
 * 将 left 的 right 节点和 right 的 left 节点放入队列
 * 时间复杂度是 O(n)O(n)，空间复杂度是 O(n)O(n)

 */
public class _101_对称二叉树 {
	
	
//	迭代
    public boolean isSymmetric(TreeNode root) {
    	if (root==null||(root.left==null && root.right==null)) {
			return true;
		}
//    	定义队列
    	Queue<TreeNode> queue=new LinkedList<TreeNode>();
//    	先将根节点的左右结点入队
    	queue.add(root.left);
    	queue.add(root.right);
//    	循环直到队列为空
    	while(!queue.isEmpty()) {
//    		出队作比较
    		TreeNode left=queue.poll();
    		TreeNode right=queue.poll();
//    		如果左节点和右节点同时为空,说明该节点没有子节点了,直接跳出
    		if (left==null&&right==null) {
				continue;
			}
//    		如果其中一个为空说明不对称
    		if (left==null||right==null) {
				return false;
			}
//    		如果不相等
    		if (left.val!=right.val) {
				return false;
			}
//    		如果符合上述条件,左节点的左子节点入队，右节点的右子节点入队
    		queue.add(left.left);
    		queue.add(right.right);
//    		左节点的右子节点入队，右节点的左子节点入队
    		queue.add(left.right);
    		queue.add(right.left);
    	}
    	return true;
    }

  //递归
    public boolean check(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        return p.val == q.val && check(p.left, q.right) && check(p.right, q.left);
    }
    public boolean isSymmetric1(TreeNode root) {
        return check(root, root);
    }
    
}

