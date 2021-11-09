package 二叉树;

import java.util.List;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;


/*
 * 3
 * https://leetcode-cn.com/problems/binary-tree-inorder-traversal/
 */
public class _94_二叉树的中序遍历 {
	 public List<Integer> inorderTraversal(TreeNode root) {
//		 递归+中序
		 List<Integer> res=new ArrayList<Integer>();
		 
		 preorder(root, res);
		 return res;
	 }
	 public void preorder(TreeNode root,List<Integer> res) {
//		 中序：中序遍历左子树，根节点，中序遍历右子树
//		 这里相当于阻止在递归下去
		 if (root==null) {
			 return;
		 }
//		 先遍历左子树
		 preorder(root.left, res);
//		 将值存入res
		 res.add(root.val);
//		 在遍历右子树
		 preorder(root.right, res);
		 
	 }
	 
	 
//	 迭代
	 public List<Integer> inorderTraversal2(TreeNode root) {
//		 迭代+中序
		 List<Integer> res=new ArrayList<Integer>();
//		 如果链表为空就直接返回空值
		 if(root==null) {
			 return res;
		 }
//		 设置一个栈
		 Deque<TreeNode> stack=new LinkedList<TreeNode>();
//		 设置指针,指向根节点
		 TreeNode node=root;
//		 指针不为空或栈不为空就一直循环
		 while(node!=null ||!stack.isEmpty()) {
//			 先遍历左节点，将其依次入栈
			 while(node!=null) {
				 stack.push(node);
				 node=node.left;
			 }
//			 弹出栈顶元素
			 node=stack.pop();
//			 存入列表中
			 res.add(node.val);
//			 指针指向右子树,如果右子树为空就在弹出元素
			 node=node.right;			 
		 }
//		 最后输出
		 return res;
		 
		 
	 }

}

