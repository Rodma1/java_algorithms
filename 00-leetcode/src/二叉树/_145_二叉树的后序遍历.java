package 二叉树;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/*
 * 4
 */
public class _145_二叉树的后序遍历 {
//	后序+递归
	public List<Integer> postorderTraversal(TreeNode root) {
//		后序:后序左子树,后序右子树,根节点
		List<Integer> res=new ArrayList<Integer>();

		preorder(res, root);
		return res;
	}
	public void preorder(List<Integer> res,TreeNode root) {
		
//		   终止循环条件
		if (root==null) {
			return;
		}
		preorder(res, root.left);
		preorder(res, root.right);
		res.add(root.val);	   
	}
//	后序+迭代
	public List<Integer> postorderTraversal2(TreeNode root) {
//		后序:后序左子树,后序右子树,根节点
		List<Integer> res=new ArrayList<Integer>();
		if (root==null) {
			return res;
		}
//		创建栈用于存放子树
		Deque<TreeNode> stack=new LinkedList<TreeNode>();
//		创建指针
		TreeNode node=root;
	    TreeNode prev = null;
//		如果到达叶子节点或者栈为空就终止循环
		while(node!=null||!stack.isEmpty()) {
//遍历左子树
			while(node!=null) {
				stack.push(node);
				node=node.left;
			}
//			弹出栈
			node=stack.pop();
//			遍历右子树,如果该节点右右子树就入栈
			if(node.right==null|| node.right== prev) {//node.right== prev是防止出现死循环
                // stack.push(node);
                res.add(node.val);
                prev = node;
                node = null;
				
			}else {
                stack.push(node);
				node=node.right;
				
			}
		}
		return res;
	}
}
