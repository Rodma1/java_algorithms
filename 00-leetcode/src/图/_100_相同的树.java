package 图;

import java.util.LinkedList;
import java.util.Queue;

public class _100_相同的树 {
//	通过广度优先搜索解决
    public boolean isSameTree(TreeNode p, TreeNode q) {
//    	设定一个队列
    	Queue<TreeNode> queue=new LinkedList<TreeNode>();
//    	将根节点入队
    	queue.add(p);
    	queue.add(q);
    	while(!queue.isEmpty()) {
//    		出队
    		TreeNode pN=queue.poll();
    		TreeNode qN=queue.poll();
//    		比较
    		if (pN==null&&qN==null) {
				continue;
			}
    		if (pN==null||qN==null) {
				return false;
			}
    		if (pN.val!=qN.val) {
				return false;
			}
//    		最后符合条件，继续将他们的左右子节点入队
    		queue.add(pN.left);
    		queue.add(qN.left);
//    		右节点
    		queue.add(pN.right);
    		queue.add(qN.right);
    		
    	}
    	return true;
    }
}
