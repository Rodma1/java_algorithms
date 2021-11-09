package 优先队列;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;

/*
 * 1
 * https://leetcode-cn.com/problems/sort-characters-by-frequency/
 */
public class _451_根据字符出现频率排序 {
	public static String frequencySort(String s) {
//		设置返回的字符串
		String str="";
//		1. 通过哈希统计词频 2. 将value存入优先队列中进行排序 3. 最后遍历输出
		
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		for(int i=0;i<s.length();i++) {
			System.out.println(s.charAt(i));
			map.put(s.charAt(i),map.getOrDefault(s.charAt(i), 0)+1);
		}
		System.out.println(map);//{r=1, t=1, e=2}
//		设置优先队列，由于题目要求降序，所以使用大顶堆
		PriorityQueue<str> queue=new PriorityQueue<>(new Comparator<str>() {
			public int compare(str o1,str o2) {
				return o2.getCount()-o1.getCount();//大顶堆
			}
		});
//		通过for循环将对应的值入队
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			queue.offer(new str(entry.getKey(),entry.getValue()));
		}
		while(!queue.isEmpty()) {
			str+=queue.poll();
			System.out.println(str);
		}

		return str;
	}

//创建一个数据类Data，包含一个char类型的字符和int类型的次数
	public static class str{
		char c;
		int  num;
//		构造函数
		public str(char c ,int num) {
			// TODO 自动生成的构造函数存根
			this.c=c;
			this.num=num;
		}
		public char getC() {
			return this.c;
		}
		public int getCount() {
			return this.num;
		}
//		返回字符串
		public String toString() {
//			String str="";
			StringBuilder str = new StringBuilder();
			for (int i=0;i<num;i++) {
				str.append(c);
			}
			return str.toString();
		}
	}
	public static void main(String args[]) {
		String s="tree";
		String c=frequencySort(s);
	}
}
