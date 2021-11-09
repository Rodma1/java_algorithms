package 二叉树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import javax.xml.soap.Node;

public class _589_N叉树的前序遍历 {
	class Node {
	    public int val;
	    public List<Node> children;

	    public Node() {}

	    public Node(int _val) {
	        val = _val;
	    }

	    public Node(int _val, List<Node> _children) {
	        val = _val;
	        children = _children;
	    }
	};
//	迭代
	public List<Integer> preorder(Node root){
//		创建一个存入元素的列表
		List<Integer> res=new ArrayList<Integer>();
		if (root==null) {
			return res;
		}
//		设置栈
		Stack<Node> stack=new Stack<>();
//		根节点入栈
		stack.push(root);
//		循环直到根节点为空
		while(!stack.isEmpty()) {
//			出栈
			Node node=stack.pop();
//			存入队列
			res.add(node.val);
//			获取该节点的子节点
			List<Node> children = node.children;
//			由于栈是后进先出的，所以我们要将子节点从后往前放入栈中 
			for(int i=children.size()-1;i>=0;i--) {
				stack.push(children.get(i));
			}
		}
//		创建
		return res;
	}
//	递归
	public List<Integer> preorder2(Node root){
		List<Integer> res=new ArrayList<>();
		if (root==null) {
			return res;
		}
		pre(root, res);
		return res;
	}
	public void pre(Node node ,List<Integer> res) {
		Stack<Node> stack= new Stack<>();
//		停止递归
		if (node==null) {
			return ;
		}
//		将值存入
		res.add(node.val);
		List<Node> children = node.children;
//		由于栈是后进先出的，所以我们要将子节点从后往前放入栈中 
		for(int i=children.size()-1;i>=0;i--) {
			stack.push(children.get(i));
		}
	}
}
