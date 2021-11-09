package 哈希表;
/*
 * 1
 * https://leetcode-cn.com/problems/majority-element/
 */

import java.awt.print.Printable;
import java.util.HashMap;
import java.util.Map;

//通过哈希表解决问题
public class _169_多数元素 {
//	通过题目要求，我们可以使用哈希映射HashMap，存入key和value,如果有重复的key就加一
	public static int majorityElement(int[] nums) {
		Map<Integer, Integer> counts=countNums(nums);
//		声明的一个内部接口majorityEntry
		Map.Entry<Integer, Integer> majorityEntry = null;
		System.out.print(counts.entrySet());//[2=1, 3=2]
//		通过for循环获取counts中一个个键值，然后作比较获取最大的那个键
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            if (majorityEntry == null || entry.getValue() > majorityEntry.getValue()) {
                majorityEntry = entry;
            }
        }
//        返回键
        return majorityEntry.getKey();
    }
//
	public static Map<Integer, Integer> countNums(int[] nums){
//		设置哈希映射
		Map<Integer, Integer> counts=new HashMap<Integer, Integer>();
//		通过for循环遍历nums
		for(int num:nums) {
			if (!counts.containsKey(num)) {
				counts.put(num, 1);
			}else {
				counts.put(num, counts.get(num)+1);
			}
		}
		return counts;
	
	}
	public static void main(String args[]) {
		int nums[]=new int[3];
		nums[0]=3;
		nums[1]=2;
		nums[2]=3;

		int count=majorityElement(nums);
		System.out.print(count);
//        return majorityEntry.getKey();

	}
	
}
