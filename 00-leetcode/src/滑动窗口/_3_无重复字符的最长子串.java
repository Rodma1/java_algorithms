package 滑动窗口;

import java.util.HashSet;
import java.util.Set;
/*
 * https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
 */
public class _3_无重复字符的最长子串 {
//	集合+滑动窗口原理+双指针
    public int lengthOfLongestSubstring(String s) {
//    	通过右指针遍历字符到集合中，如果集合发现重复字符就退出循环,然后获取之前的长度,
//    	在通过左指针慢慢取出之前在集合中的数，直到没有重复字符出现
    	
//    	定义左右指针left,right,和最大值ans
    	int ans=0,left=0,right=0;
//    	定义集合
    	Set<Character> set=new HashSet<>();
    	
//    	第一层遍历左指针,取出集合中的数
    	int len=s.length();
    	for(;left<len;left++) {
//    		如果left不为0,说明要么right到顶，要么存在相同元素,如果是第二种就不断移除
    		if (left!=0) {
//    			left左指针向左移动一格去除,因为之前++,left变成1,我们要移除第一个数,
//    			若是下面遍历还发现有相同元素，left=2，在移除第一个数
				set.remove(s.charAt(left-1));
			}
    		
//    		通过右指针,将元素遍历到集合中,如果超过长度或者集合中已经存在该元素就停止
    		while(right<len&&!set.contains(s.charAt(right))) {
    			set.add(s.charAt(right));
    			// 不断地移动右指针
    			right++;
    		}
    		if (right<len) {
    			ans=Math.max(ans, right-left);
			}
//    		通过比较每个窗口的长度来取最大值,窗口大小就是左指针减去右指针
    		ans=Math.max(ans, right-left);
    	}
    	return ans;
    }
}
