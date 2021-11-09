package 优先队列;


import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class _692_前K个高频单词 {
//	1. 通过哈希获取词频 o(n)2. 通过优先队列排序o(mlogk) （大顶堆）3.返回遍历输出o(k) 
    public List<String> topKFrequent(String[] words, int k) {
    	List<String> res=new LinkedList<String>();
    	Map<String, Integer> map=new HashMap<String, Integer>();
//    	for循环遍历统计
    	int c=0;
    	String w[] = new String[words.length];
    	for(String word:words) {
    		map.put(word, map.getOrDefault(word, 0)+1);
    		
    	}
        
    
        // System.out.print(map);
//    	优先队列
    	PriorityQueue<Data> queue=new PriorityQueue<>(new Comparator<Data>() {
    		public int compare(Data o1,Data o2) {
                // 如果两个值相等，则按照字母顺序排列，不相等就用大顶堆
    				return o2.getV()==o1.getV()?o1.getK().compareTo(o2.getK()):o2.getV()-o1.getV();//大顶堆
    		}
		});
//    	将map中的键值循环遍历到队列中
    	for(Map.Entry<String, Integer> entry:map.entrySet()) {
    		queue.offer(new Data(entry.getKey(),entry.getValue()));
    	}
//    	循环遍历出队前k个值
    	for(int i=0;i<k;i++) {
    		
    		Data data= (Data)queue.poll();
//    		调用函数
            //  System.out.print(data.getK());
    		res.add(data.getK());
    	}
        //  Collections.reverse(res);
    	return res;
    			
    }
//    设置数据类Data
    public class Data{
    	String key;
    	int value;
    	public Data(String key,int value) {
			this.key=key;
			this.value=value;
		}
//    	设置获取key函数
    	public String getK() {
    		return this.key;
    	}
    	public int getV() {
    		return this.value;
    	}
    }
}
