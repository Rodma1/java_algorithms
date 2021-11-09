package 图;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

import javax.swing.text.AbstractDocument.BranchElement;

public class 深度优先搜索的基本使用 {
//	遍历到最底下,在返回根节点继续遍历到最底下
	public static void main(String args[]) {
		

//		假设我定义了一个图grap,我们要通过广度优先搜索把它遍历出来存入到set中
		Node grap=new Node();
//		设定一个集合判断元素是否重复
		Set<Node> set=new HashSet<>();
//		设值一个栈用来存入元素
		Stack<Node> stack=new Stack<>();
//		根节点入栈
		stack.push(grap);
//		存入根节点元素
		set.add(grap);
//		如果栈为空就结束循环
		while(!stack.isEmpty()) {
//			出栈
			Node Node=stack.pop();
//			通过for循环获取他的子节点
			for(Node node:Node.children) {
//				如果集合中存在就不入栈
				if (set.contains(node)) {
					continue;
				}
				stack.push(node);
				set.add(node);
				break;
				
			}
		}
	}
}
