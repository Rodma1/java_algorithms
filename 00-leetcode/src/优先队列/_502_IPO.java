package 优先队列;

import java.util.Arrays;
import java.util.PriorityQueue;

/*
 * https://leetcode-cn.com/problems/ipo/
 * 解题思路
 * 1. 按所需要的资本排序
 * 2. 在小于等于总资本的项目启动资本中选择最大的利润项目
 * 3. 更新总资本w
 * 4.重复2和3的操作,直到选择k次
 * 解题方法
 * 1.小于等于总资本的项目压入堆中
 * 2.利用大根堆，每次取出最大利润，更新手中资本
 * 3. 重复1 2操作
 * 4. 如果当前的堆为空，则此时我们应当直接返回。
 */
public class _502_IPO {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
//    	定义一个数组指针
    	int node=0;
//    		将项目利润和资本合并成二维数组
		int[][] res=new int [profits.length][2];
		for(int i=0;i<profits.length;i++) {
			res[i][0]=profits[i];
			res[i][1]=capital[i];
		}
//    		对二维数组进行排序，排序的依据是最小资本capital
		Arrays.sort(res,(a,b)->a[1]-b[1]);
//    	定义优先队列,从大到小排序输入进来的利润
		PriorityQueue<Integer> queue=new PriorityQueue<>((x,y)->y-x);//大顶堆
		
//		如果到达指定的k个项目就停止
		while(k-->0) {
//			通过循环将符合条件的资本入队
			while(node<profits.length&& res[node][1]<=w) {
				queue.add(res[node][0]);
                node++;
			}
//			如果队列为空，就出队利润加入到总资产里
			if (!queue.isEmpty()) {
				w=w+queue.poll();
			}else {
//				如果队列为空说明没有符合资本的项目了
				break;
			}
		}
		return w;
    }
}
