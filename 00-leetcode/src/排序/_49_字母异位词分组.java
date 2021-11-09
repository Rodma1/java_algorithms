package 排序;

import java.util.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/*
 * https://leetcode-cn.com/problems/group-anagrams/
 * 解题思路:每个字母异位词分组字符都是相同得，只不过字符顺序不一样，
 * 我们可以将他们变成ascll然后进行排列,最后在转为字符串，
 * 根据散列表性质：将顺序排号得字符作为键，字母异位词作为值
 * 
 */
public class _49_字母异位词分组 {
//	一旦需要根据特征进行归类就要散列表
    public static List<List<String>> groupAnagrams(String[] strs) {
//    	如果字符长度为0就返回空
//    	定义哈希散列表
    	HashMap<String,List<String>> map=new HashMap<>();
//		遍历
    	for(String str:strs) {
//    		将字符串转为字符数组
    		char[] s=str.toCharArray();
//    		然后进行排序,由于是字符，所以可以根据ascll码来排序
    		Arrays.sort(s);
//    		然后在转为字符串
    		String st=String.valueOf(s);
//    		如果排序好的数据不存在哈希中，那么就是新的字符串
    		if (!map.containsKey(st)) {
//				将这个新的键存入，创建一个队列空值
    			map.put(st, new ArrayList()) ;
			}
//    		不管哈希表里有没有这个字符串都存入
    		map.get(st).add(str);//获取对应得键值追加
    	}
    	return  new ArrayList(map.values());
    	
        
    }
    public static void main(String args[]) {
    	String[] strs= {"eat", "tea", "tan", "ate", "nat", "bat"};
    	List<List<String>> s=groupAnagrams(strs);
    	System.out.print(s);
    }
}
