package 二叉树;

import java.util.Stack;

public class _98_验证二叉搜索树 {
//    通过中序遍历判断
	public boolean isValidBST(TreeNode root) {
//    	定义一个栈
		Stack<TreeNode> stack=new Stack<>();
//		定义一个最小值用于比较
		double min=-Double.MAX_VALUE;
//		设置一个指针
		TreeNode node=root;
		while(node!=null||!stack.isEmpty()) {
//			遍历到最左边
			while(node!=null) {
				stack.push(node);
				node=node.left;
			}
//			出栈
			node=stack.pop();
			if (node.val<=min) {
				return false;
			}else {
				min=node.val;
			}
//			指向右元素
			node=node.right;
			
		}
		return true;
    }
}
