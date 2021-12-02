package 数组;

import java.util.Arrays;
import java.util.HashMap;

/**
 * https://leetcode-cn.com/problems/relative-ranks/
 */
public class _506_相对名次 {
    /**
     * 排序+hash
     * @param score
     * @return
     */
    public String[] findRelativeRanks(int[] score) {
        int len=score.length;
        String[] src={"Gold Medal","Silver Medal","Bronze Medal"};
//        存入hashMap
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for (int i=0;i<len;i++){
            hashMap.put(score[i],i);
        }
//        排序
        Arrays.sort(score);
//        定义字符数组
        String[] strings=new String[len];
        int len1=0;
        for (int i=len-1;i>=0;i--){
//            通过哈希获取排序前的下标

            if (len1<3){
                // System.out.println(score[i]);
                strings[hashMap.get(score[i])]=src[len1++];
            }else{
                strings[hashMap.get(score[i])]=String.valueOf(++len1);
            }
        }
        return strings;

    }
}
