package 优先队列;

import java.util.Comparator;
import java.util.PriorityQueue;
/*
 * 4
 * https://leetcode-cn.com/problems/kth-smallest-element-in-a-sorted-matrix/
 */
public class _378_有序矩阵中第K小的元素 {
	public int kthSmallest(int[][] matrix, int k) {
		
		int[] n;
		 
        int len = 0;
        // 计算一维数组长度
        for (int[] element : matrix) {
            len += element.length;
        }
        // 复制元素
        n = new int[len];
        int index = 0;
        for (int[] element : matrix) {
            for (int element2 : element) {
                n[index++] = element2;
            }
        }
//        通过优先队列存入数据
        PriorityQueue<Integer> queue=new PriorityQueue<>(new Comparator<Integer>() {
        	public int compare(Integer o1,Integer o2) {
				return o2-o1;//大顶堆
			}
        });
//        for循环入栈
        for(int i=0;i<k;i++) {
        	queue.offer(n[i]);
        }
//        在for循环判断
        for(int i=k;i<n.length;i++) {
        	if (queue.peek()>n[i]) {
				queue.poll();
				queue.offer(n[i]);
			}
        }
        return queue.peek();
	}
	
//  方法二:效率有点底
//  for (int[] nums:matrix){
//      for(int num:nums) {
//      	if(queue.size()>=k) {
//      		if (queue.peek()>num) {
//  				queue.poll();
//  				queue.offer(num);
//  			}
//      	}else {
//      		queue.offer(num);
//      	}
//      }
//  }
//可以通过优先队列中的大顶堆判断
	public static void main(String[] args) {

	}

}
