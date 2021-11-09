package 哈希表;

import java.util.HashMap;



public class _剑指Offer50_第一个只出现一次的字符 {
	public char firstUniqChar(String s) {

//		设置哈希函数
		HashMap<Character,Integer> map=new HashMap<>();
//		通过for循环将值put
		for(int i=0;i<s.length();i++) {
			int count=map.getOrDefault(s.charAt(i), 0)+1;
			map.put(s.charAt(i),count);
		}
//		通过for循环寻找值为1的键输出
		for(int i=0;i<s.length();i++) {
			if (map.get(s.charAt(i))==1) {
				return s.charAt(i);
			}
		}
		return ' ';
	}
}
