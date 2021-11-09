package 水题;

import java.util.HashSet;
import java.util.Set;

public class _1980_找出不同的二进制字符串 {
//	通过哈希表来判断
    public String findDifferentBinaryString(String[] nums) {
//    	先判断n的长度
    	int len=nums[0].length();
    	Set<String> map=new HashSet<>();
    	for(String num:nums) {
    		map.add(num);
    	}
//    	字符由0和1组成，所以我们遍历判断他是否在map中
    	
//    	遍历比nums里面的数更多的一个数就够了
    	for(int i=0;i<=nums.length;i++) {
//    		设置保存字符串,在 StringBuilder 上的主要操作是 append 和 insert 方法。
    		StringBuilder str=new StringBuilder();
//    		通过for循环组成二进制
    		for(int j=0;j<len;j++) {
//    			通过无符号右移运算符>>>和与&符号(是1就是1，否则都为0)
    			str.append( i>>> j&1);
//    			第一次遍历i右移j位
    		}
//    		最后逆转,比如这样输出顺序就是00,01,10,这里没有11，不过没关系,
    		//题目是nums[i].length == n，所以最多只要三个就能判断
    		str.reverse();
    		if(!map.contains(str.toString())) {
    			return str.toString();
    		}
    	}
    	return "";
    }
}
