package 哈希表;
/*
 * 4
 * https://leetcode-cn.com/problems/isomorphic-strings/
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class _205_同构字符串 {
//	根据题目要求我们可以通过哈希映射，将字符串一一对应
	public static boolean isIsomorphic(String s, String t) {
//		设置哈希映射
		Map<Character,Character > s_map=new HashMap<Character,Character>();
		Map<Character,Character > t_map=new HashMap<Character,Character>();
//		由于题目假设长度相同，我们就不需要判断了，直接通过循环将键值放入到哈希中
		for (int i=0;i<s.length();i++) {
			System.out.print(i);
//			如果键或值在哈希表
			if ((s_map.containsKey(s.charAt(i))&&s_map.get(s.charAt(i))!=t.charAt(i) )||(t_map.containsKey(t.charAt(i))&& s.charAt(i)!=t_map.get(t.charAt(i)))) {
//				如果与t字符串指定的字符匹配不上，就返回false
//				System.out.print(n.get(s_map.charAt(i)));
//				如果取出来的值不等
				
				return false;

			}else {
				s_map.put(s.charAt(i),t.charAt(i));
				t_map.put(t.charAt(i),s.charAt(i));
				System.out.print(s_map);
				
			}
		}
		return true;
    }
//	public static Map<String, String> countNums(String s,String t){
////		设置哈希映射
//		Map<String, String> n=new HashMap<String, String>;
//		
//		
//		return n;
//	}
	public static void main(String args[]) {
		String s="badc";
		String b="baba";
		boolean c=isIsomorphic(s, b);
		System.out.println(c);
	}
}
