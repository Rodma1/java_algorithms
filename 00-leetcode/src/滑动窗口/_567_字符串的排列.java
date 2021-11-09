package 滑动窗口;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

import javax.print.attribute.standard.Sides;

public class _567_字符串的排列 {
//	失败品，理解题目错误,比如cba,只要文中包含cba这三个字符连续的就行,不管是acb或abc都返回ture
    public boolean checkInclusion(String s1, String s2) {

	//		获取s1的逆序
		StringBuffer stringBuffer = new StringBuffer(s1);
	    String s3 = stringBuffer.reverse().toString();
	    System.out.println(s3);
	//    定义两个指针左指针再开始位置,右指针s1长度减1的位置
	    int len=s1.length()-1;
	    int left=0,right=len,pivot=0;
	    while(right<s2.length()) {
	        left=pivot;
	    	StringBuffer s = new StringBuffer();
	    	while(left<=right) {
	    		s.append(s2.charAt(left));
	    		left++;
	
	    	}
	        String s4=s.toString();
	        System.out.println(s4);
	    	if (s4.equals(s1)||s4.equals(s3)) {
				return true;
			}
	        pivot++;
	    	right++;
	    }
	    return false;
    }
//    失败品二号
    public boolean checkInclusion1(String s1, String s2) {
//    	定义哈希存表存入
    	HashMap<Character, Integer> map=new HashMap<>();
    	for(int i=0;i<s1.length();i++) {
    		map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0)+1);
    	}
    	HashMap<Character, Integer> map2=new HashMap<>();
    	map2=map;
    	//    定义两个指针左指针再开始位置,右指针s1长度减1的位置
	    int len=s1.length()-1;
	    int left=0,right=len,pivot=0;
	    while(right<s2.length()) {
	        left=pivot;
	        int i=0;
	    	while(left<=right) {
                System.out.println(map2);
                 System.out.print(s2.charAt(left));
	    		if (map2.containsKey(s2.charAt(left))&&map2.get(s2.charAt(left))!=0) {
					map2.put(s2.charAt(left),  map2.getOrDefault(s2.charAt(left), 0)-1);
                   
	    			i++;
				}else {
                    left=left-1;
                    while(left>=pivot) {
						map2.put(s2.charAt(left),  map2.getOrDefault(s2.charAt(left), 0)+1);
						left--;
                    }
					break;
				}
	    		left++;
	    	}
            System.out.print(" ");
	    	if (i==s1.length()) {
				return true;
			}
            // map2=map;
	        pivot++;
	    	right++;
	    }
	    return false;
    	
    }
//不行了看官方解答
    public boolean checkInclusion2(String s1, String s2) {
        int n = s1.length(), m = s2.length();
        if (n > m) {
            return false;
        }
        int[] cnt1 = new int[26];
        int[] cnt2 = new int[26];
        for (int i = 0; i < n; ++i) {
            ++cnt1[s1.charAt(i) - 'a'];
            ++cnt2[s2.charAt(i) - 'a'];
        }
        if (Arrays.equals(cnt1, cnt2)) {
            return true;
        }
        for (int i = n; i < m; ++i) {
            ++cnt2[s2.charAt(i) - 'a'];
            --cnt2[s2.charAt(i - n) - 'a'];
            if (Arrays.equals(cnt1, cnt2)) {
                return true;
            }
        }
        return false;
    }
}
