package 字符串;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * https://leetcode-cn.com/problems/first-unique-character-in-a-string/
 * 找到它的第一个不重复的字符
 */
public class _387_字符串中的第一个唯一字符 {
//    第一种解法：哈希表
	public int firstUniqChar(String s) {
//    	设置哈希表
		HashMap<Character, Integer> map=new HashMap<>();
//		通过for循环将字符存入集合中
		for(int i=0;i<s.length();i++) {
//			通过哈希表统计每个字符出现的频数
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
		}
//		在通过for循环遍历找到第一个值为1的数
		for(int i=0 ;i<s.length();i++) {
			if (map.get(s.charAt(i))==1) {
				return i;
			}
		}
		return -1;
    	
    }
}
