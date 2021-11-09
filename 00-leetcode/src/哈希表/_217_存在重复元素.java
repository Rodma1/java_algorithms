package 哈希表;

import java.util.HashSet;
import java.util.Set;

/*
 * 5
 * https://leetcode-cn.com/problems/contains-duplicate/
 */
public class _217_存在重复元素 {
	public boolean containsDuplicate(int[] nums) {
		//使用哈希集合
		Set<Integer> res=new HashSet<Integer>();
		for(int num:nums) {
//			如果在集合中就返回false
//			if(res.contains(num)) {
//				return false;
//			}else {
////				否则就加入集合
//				res.add(num);
//			}
//			由于哈希集合特性是无法存入已经存在的数，所以可以通过这个判断，如果存入失败,就返回true
			if(!res.add(num)) {
				return true;
			}
		}
		return true;
	}
}
