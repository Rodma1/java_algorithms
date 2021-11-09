package 二叉树;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 * 7
 * https://leetcode-cn.com/problems/binary-tree-level-order-traversal-ii/
 */
public class _107_二叉树的层序遍历II {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
//    创建列表
    	List<List<Integer>> res=new ArrayList<List<Integer>>();
    	if(root==null) {
    		return res;
    	}
//    	创建队列
    	Queue<TreeNode> queue=new LinkedList<TreeNode>();
//    	将根节点放入队列
    	queue.offer(root);
//    	while循环判断队列是否为空
    	while(!queue.isEmpty()) {
//    		在创建一个列表用于存放每一层的节点
    		List<Integer> res1=new ArrayList<Integer>();

//    		获取队列元素个数
    		int queue_size=queue.size();
//    		for循环逐一取出
    		for (int i=0;i<queue_size;i++) {
//        		出队
        		TreeNode node=queue.poll();
//        		如果有左右节点就入队，由于队列是先进先出，所以后面来的元素不影响
        		if (node.left!=null) {
					queue.offer(node.left);
				}
        		if (node.right!=null) {
					queue.offer(node.right);
				}
        		res1.add(node.val);
        		

    		}
//    		res.add(0,res1);也可以直接添加到尾部，不用反转
    		res.add(res1);
    	}
//    	最后反转
    	Collections.reverse(res);
    	return res;
    }
}
