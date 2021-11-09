package 字符串;

import java.util.HashMap;

public class _383_赎金信 {
//	先将ransom里面的字符串存入哈希，在遍历magazine杂志里面字符串，如果匹配且值为0就移除，直到哈希为空
    public boolean canConstruct(String ransomNote, String magazine) {
//    	定义哈希映射
    	HashMap<Character, Integer> map=new HashMap<>();
//    	通过遍历将字符存入哈希中
    	for(int i=0;i<ransomNote.length();i++) {
    		char c=ransomNote.charAt(i);
    		map.put(c, map.getOrDefault(c, 0)+1);
    	}
//    	在遍历magazine杂志里面字符串，如果匹配且值为0就移除，直到哈希为空
    	for(int i=0;i<magazine.length();i++) {
    		char c=magazine.charAt(i);
    		if (map.containsKey(c)) {
				map.put(c, map.getOrDefault(c, 0)-1);
//	    		如果该键的值小于等于0就移除
	    		if (map.get(c)<=0) {
					map.remove(c);
				}
			}
    		if (map.isEmpty()) {
				return true;
			}

    	}
    	return false;
    }
}
