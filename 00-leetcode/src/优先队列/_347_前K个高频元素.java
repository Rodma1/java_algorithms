package 优先队列;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
/*
 * 5
 * https://leetcode-cn.com/problems/top-k-frequent-elements/
 */
public class _347_前K个高频元素 {
    public  int[] topKFrequent(int[] nums, int k) {
    //    	涉及到词语频率可以用哈希表，前k高的元素可以用优先队列（大顶堆）
    	
    	Map<Integer, Integer> map=new HashMap<Integer, Integer>();
//    	通过for循环计算键出现的次数
    	for(int num:nums) {
    		map.put(num, map.getOrDefault(num, 0)+1);
    	}
//    	设置优先队列
    	PriorityQueue<Data> queue=new PriorityQueue<>(new Comparator<Data>() {
			public int compare(Data o1,Data o2) {
				return o2.getCount()-o1.getCount();//大顶堆
			}
		});
//    	for循环遍历哈希数据到队列中
    	for(Map.Entry<Integer, Integer> entry:map.entrySet()) {            
    		queue.offer(new Data(entry.getKey(),entry.getValue()));
    	}
//    	取出前k个数输出
       
    	int res[]=new int[k];
//    	for循环遍历列表前k个值
    	for (int i=0;i<k;i++) {
//    		获取弹出的值
            Data data= (Data)queue.poll();
            // System.out.print(data.getC());
    		res[i]=data.getC();
    		
    	}
        return res;
    }
//    创建一个数据类Data，包含一个int类型的数字和int类型的次数；
    public static class Data {
    	int key;
    	int value;
        
    	public Data(int key,int value) {
    		this.key=key;
    		this.value=value;
    	}
//获取键
        public int getC() {
			return this.key;
		}
//        获取值
		public int getCount() {
			return this.value;
		}
    }
}
