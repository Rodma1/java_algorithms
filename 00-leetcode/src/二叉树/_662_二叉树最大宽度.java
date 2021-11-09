package 二叉树;

import java.util.LinkedList;
import java.util.Queue;
/*
 * 8
 * https://leetcode-cn.com/problems/maximum-width-of-binary-tree/submissions/
 */
public class _662_二叉树最大宽度 {
//	宽度优先搜索[Accepted]
	public int widthOfBinaryTree(TreeNode root) {
		if (root==null) {
			return 0;
		}
		//设置队列
		Queue<AnnotatedNode> queue=new LinkedList<>();
//		将头节点入队
		queue.offer(new AnnotatedNode(root, 0, 0));
//		设置值，left作用是判断最左边节点的位置
		int ans=0,curDepth=0,left=0;
//		如果队列为空就终止循环
		while(!queue.isEmpty()) {
//			出队
			AnnotatedNode c=queue.poll();
//			如果节点不为空就判断
			if (c.node!=null) {
//				该节点的左右节点入队,深度加1,位置由原来的位置乘2
				queue.offer(new AnnotatedNode(c.node.left, c.depth+1, c.pos*2));
				queue.offer(new AnnotatedNode(c.node.right, c.depth+1, c.pos*2));
//				如果深度不一样,调整最左边节点的位置
				if (curDepth!=c.depth) {//每层第一个（最左）出栈以后会更新最左标志
					curDepth=c.depth;
					left=c.pos;
				}
//				通过最右边减去最左边判断宽度
				ans=Math.max(ans, c.pos-left+1);//每次出栈一个节点都会计算一次
			}
			
			
		}
		return ans;
    }
//	设置参数
	class AnnotatedNode{//用于包装一下树的节点来记录每个节点的数学位置和层位置
		TreeNode node;
//		这里的depth是树的深度，pos是位置
		int depth,pos;
		AnnotatedNode(TreeNode a,int b,int c){
			node=a;
			depth=b;
			pos=c;
		}
	}
}
