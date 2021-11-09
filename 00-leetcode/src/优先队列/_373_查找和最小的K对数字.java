package 优先队列;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
/*
 * 6
 * https://leetcode-cn.com/problems/find-k-pairs-with-smallest-sums/
 */
//此题使用优先队列（小顶堆），通过双重for循环遍历
public class _373_查找和最小的K对数字 {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
    	List<List<Integer>> res=new LinkedList<List<Integer>>();
//    	设置优先队列
    	PriorityQueue<Data> queue=new PriorityQueue<>(new Comparator<Data>() {
    		
    		public int compare(Data o1,Data o2) {
				return o1.get()-o2.get();//小顶堆
			}
		});
//    	第一层循环遍历num1
    	for(int i=0;i<(nums1.length<k?nums1.length:k);i++) {
//    		第二层遍历nums2
    		for(int j=0;j<(nums2.length<k?nums2.length:k);j++) {
//    			组合存入到优先队列中
                // if(nums2[j]){

                // }
    			queue.offer(new Data(nums1[i],nums2[j]));
    		}
    	}
//    	通过for循环遍历前k个数据
        int num=k>queue.size()?queue.size():k;
        // System.out.print(num);
    	for(int i=0;i<num;i++) {
            // 
    		Data j=(Data)queue.poll();
    		List<Integer> re=new LinkedList<>();
    		re.add(j.num1);
    		re.add(j.num2);
   		    // System.out.print(j.num1+" "+j.num2);
    		res.add(re);
            // re.clear();
    		
    	}
    	return res;
    }
//    设置数据类
    public class Data{
    	int  num1;
    	int num2;
    	public  Data(int num1,int num2) {
			this.num1=num1;
			this.num2=num2;
            
		}
        public int get(){
            return this.num1+this.num2;
        }
    	public  int get1() {
			return this.num1;
		}
    	public  int get2() {
			return this.num2;
		}
    }
}
