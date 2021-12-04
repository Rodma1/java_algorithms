package 字符串;

import java.util.HashMap;

public class _383_赎金信 {
    //	先将ransom里面的字符串存入哈希，在遍历magazine杂志里面字符串，如果匹配且值为0就移除，直到哈希为空
    public boolean canConstruct(String ransomNote, String magazine) {
//    	定义哈希映射
        HashMap<Character, Integer> map = new HashMap<>();
//    	通过遍历将字符存入哈希中
        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
//    	在遍历magazine杂志里面字符串，如果匹配且值为0就移除，直到哈希为空
        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.getOrDefault(c, 0) - 1);
//	    		如果该键的值小于等于0就移除
                if (map.get(c) <= 0) {
                    map.remove(c);
                }
            }
            if (map.isEmpty()) {
                return true;
            }

        }
        return false;
    }

    //    字符统计
    public boolean canConstruct1(String ransomNote, String magazine) {
        // 杂志的字符串长度必须大于赎金信
        if (magazine.length() < ransomNote.length()) {
            return false;
        }
        // 先统计杂志的字符（众所周知英文字母有26个）
        int[] word = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            // a=97
            word[magazine.charAt(i) - 'a']++;
        }
        // 判断赎金信的字符
        for (int i = 0; i < ransomNote.length(); i++) {
            word[ransomNote.charAt(i) - 'a']--;
            if (word[ransomNote.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }

    //    字符统计优化
    public boolean canConstruct2(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        int[] cnt = new int[26];
        for (char c : magazine.toCharArray()) {
            cnt[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            cnt[c - 'a']--;
            if (cnt[c - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }


}
