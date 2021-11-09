package 二叉树;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

import javax.xml.transform.Templates;


public class _590_N叉树的后序遍历 {
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
//	这道题的思路跟后序遍历差不多，不过我们先获取根节点，在遍历右节点，在遍历左节点，最后倒序一样的道理
	public List<Integer> postorder(Node root) {
//        设置列表
		List<Integer> res=new ArrayList<Integer>();
		if (root==null) {
			return res;
		}
//		设置存放元素的栈
		Stack<Node> stack=new Stack<>();
		stack.push(root);
//		通过while循环判断
		while(!stack.isEmpty()) {
			Node node=stack.pop();
			res.add(node.val);
			for(Node child:node.children) {
				stack.push(child);
			}
		}
		Collections.reverse(res);
		return res;
    }
}
