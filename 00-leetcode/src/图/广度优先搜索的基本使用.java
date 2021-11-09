package 图;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;



public class 广度优先搜索的基本使用 {

	public static void main(String args[]) {
//		假设我定义了一个图grap,我们要通过广度优先搜索把它遍历出来存入到set中
		Node grap=new Node();
//	假设设置一个set集合,来判断是否已经访问过该节点
		Set<Node> set=new HashSet<>();
//		如果为空就直接返回
		if (grap==null) {
			return;
		}
//		设置一个队列用于存放图中的元素
		Queue<Node> queue=new LinkedList<>();
//		将根节点入队
		queue.offer(grap);
//		通过while循环直到队列为空
		while(!queue.isEmpty()) {
//			出队
			Node Node=queue.poll();
			System.out.print(Node.val);
//			添加到集合中
			set.add(Node);
//			通过for循环遍历Node存在的子节点
			for(Node node:Node.children) {
//				通过contains判断是否包含
				if (set.contains(node)) {
					continue;
				}
				queue.offer(node);
			}
		}
	}
}
