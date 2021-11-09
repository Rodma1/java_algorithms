package 哈希表;

import java.util.HashMap;
import java.util.Map;

/*
 * 7
 * https://leetcode-cn.com/problems/valid-anagram/
 */
public class _242_有效的字母异位词 {
	public static boolean isAnagram(String s,String t) {
//		由题目我们可以创建两个哈希映射，对s和t两个设置键值来判断
		if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> table = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            table.put(ch, table.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            table.put(ch, table.getOrDefault(ch, 0) - 1);
            System.out.print(table);
            if (table.get(ch) < 0) {
                return false;
            }
        }
        return true;

	}
	public static void main(String args[]) {
		String s="anagram";
		String b="nagarvm";
		boolean c=isAnagram(s, b);
		System.out.println(c);
	}
}
