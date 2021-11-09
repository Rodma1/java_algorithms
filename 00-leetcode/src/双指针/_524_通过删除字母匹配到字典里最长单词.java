package 双指针;

import java.util.List;

/*
 * https://leetcode-cn.com/problems/longest-word-in-dictionary-through-deleting/
 *通过遍历每个数组的字符一一匹配
 *解释：字典序是指从前到后比较两个字符串的大小的方法。首先比较第一个字符，如果不同则第一个字符较小的字符串更小，
 *如果相同则继续比较第2个字符......如此继续，来比较整个字符串的大小。
 */
public class _524_通过删除字母匹配到字典里最长单词 {
    public String findLongestWord(String s, List<String> dictionary) {
//    	定义返回字符串
    	String string="";

    	for(int i=0;i<dictionary.size();i++) {
//        	定义双指针，一个指向s，一个指向dictionary
        	int s_left=0,d_left=0;
//    		遍历每一个字符
    		while(s_left<s.length()&&d_left<dictionary.get(i).length()) {
    			if (dictionary.get(i).charAt(d_left)==s.charAt(s_left)) {
					d_left++;
				}
    			s_left++;
    		}
//    		如果s_left还在s中，说明是匹配完了d_left指向的字符的
    		if (d_left==dictionary.get(i).length()) {
//				将sting字符串和这个新的字符串作比较，比较依据是最长且字典顺序最小,通过compareTo来比较字符串的ascll码
                if (dictionary.get(i).length() > string.length() || (dictionary.get(i).length() == string.length() && dictionary.get(i).compareTo(string) < 0)) {
                	string = dictionary.get(i);
                }

			}

    	}
    	return string;
    }

	
}
