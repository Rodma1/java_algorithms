package 二叉树;

import java.util.List;
import java.nio.channels.NonWritableChannelException;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/*
 * 2
 * https://leetcode-cn.com/problems/binary-tree-preorder-traversal/
 */
public class _144_二叉树的前序遍历 {
//	递归，前序遍历
//	public List<Integer> preorderTraversal(TreeNode root) {
//	创建一个列表
//        List<Integer> res = new ArrayList<Integer>();
//	将链表和列表放入到函数中
//        preorder(root, res);
//	返回遍历后的结果
//        return res;
//    }
//
//    public void preorder(TreeNode root, List<Integer> res) {
//	如果链表为空就直接返回结果
//        if (root == null) {
//            return;
//        }
//	将链表中的头节点值存入到列表中
//        res.add(root.val);
//	在递归其左子树
//        preorder(root.left, res);
//	在递归其右子树
//        preorder(root.right, res);
//    }
    
    
//    迭代
//	public List<Integer> preorderTraversal(TreeNode root) {
//	设置列表
//	       List<Integer> res = new ArrayList<Integer>();
//	如果链表为空就直接返回
//	        if (root == null) {
//	            return res;
//	        }
////	        
//设置栈
//	        Deque<TreeNode> stack = new LinkedList<TreeNode>();
////	        指定根节点
//	        TreeNode node = root;
////	        如果栈不为空或者node不为null就一直循环
//	        while (!stack.isEmpty() || node != null) {
////	        	先循环左节点
//	            while (node != null) {
////	            	获取节点值
//	                res.add(node.val);
////	                将节点入栈
//	                stack.push(node);
////	                指定下一个左节点
//	                node = node.left;
//	            }
////	            左节点循环完毕就到右节点
//	            node = stack.pop();
//	            node = node.right;
//	        }
//	        return res;
//	    }

//    }
    
}
