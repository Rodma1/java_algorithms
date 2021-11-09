package 二叉树;

import java.util.LinkedList;
import java.util.Queue;


/*
 * 1
 * https://leetcode-cn.com/problems/invert-binary-tree/
 * 翻转一颗二叉树就是将其所有左右节点的左右子树都交换，也就是需要遍历所有节点，前序遍历
 */
public class _226_翻转二叉树<E> {
	public TreeNode invertTree(TreeNode root) {
//		前序遍历，先访问自己，在访问左右
		if (root==null) return root;
//		先遍历头节点的子树
		TreeNode tmp=root.left;
		root.left=root.right;
		root.right=tmp;
//		再用递归方法遍历左右子树，先遍历左或者右都没关系
		invertTree(root.left);
		invertTree(root.right);
		return root;
	}
	public TreeNode invertTree1(TreeNode root) {		
//		方法二:后序遍历，先访问左右，在访问自己
		if (root==null) return root;
//		先用递归方法遍历左右子树，先遍历左或者右都没关系
		invertTree(root.left);
		invertTree(root.right);
//		在将左右子树调换
		TreeNode tmp=root.left;
		root.left=root.right;
		root.right=tmp;

		return root;
	}
	public TreeNode invertTree2(TreeNode root) {
//		方法三:中序遍历，先访问左，在自己（头节点），在右
		if (root==null) return root;
//		先用递归方法遍历左子树
		invertTree(root.left);
		
//		在将左右子树调换
		TreeNode tmp=root.left;
		root.left=root.right;
		root.right=tmp;
//		这里注意不能写right，因为上边已经将左右子树调换了,right已经变成left了。
		invertTree(root.left);
		return root;
	}
	public TreeNode invertTree3(TreeNode root) {
//		方法四:层序遍历,从上到下，从左到右一次访问每一个节点
		if (root==null) return root;
//		创建队列，队列里面放节点TreeNode
		Queue<TreeNode> queue=new LinkedList<>();
//		将根节点入队
		queue.offer(root);
//		循环遍历,只要队列不为空，我就不断去除队列的头节点
		while(!queue.isEmpty()) {
//			出队
			TreeNode node=queue.poll();
//			System.out.print(node.element);
//			 将队头里面的元素左右交换
			TreeNode tmp=node.left;
			node.left=node.right;
			node.right=tmp;
//			如果发现左右节点有值就入队
			if(node.left!=null) {
				queue.offer(node.left);
			}
			if (node.right!=null) {
				queue.offer(node.right);
				
			}
		}
		return root;	
	}
		
		
}
