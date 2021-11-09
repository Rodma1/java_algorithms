package 哈希表;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * https://leetcode-cn.com/problems/repeated-dna-sequences/
 * 这道题可以通过hash解决，我们每次都通过substring去取出10个数，然后放入到hash里面
 */
public class _187_重复的DNA序列 {
    public List<String> findRepeatedDnaSequences(String s) {
//    	定义列表
    	List<String> res=new ArrayList<String>();
    	int len =s.length();
    	if (len<10) {
			return res;
		}
//    	定义哈希
    	HashMap<String, Integer> map=new HashMap<>();
//    	定义长度
    	int x=10;
//    	通过for循环一个个遍历
    	for(int i=0;i<=len-10;i++) {
//    		取i到x+i的数,也就是取10个数
    		String sub=s.substring(i,i+x);
//    		将sub存入哈希
    		map.put(sub, map.getOrDefault(sub, 0)+1);
//    		判断是否已经存入两次了
    		if (map.get(sub)==2) {
//    			是就存入列表
				res.add(sub);
			}
    		
    	}
    	return res;
    	
    }
}
