package 集合;

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/*
 * 1
 * 给定两个数组，编写一个函数来计算它们的交集。
 * https://leetcode-cn.com/problems/intersection-of-two-arrays/
 */
public class _349_两个数组的交集 {
	 public int[] intersection(int[] nums1, int[] nums2) {
//		 由于题目给的是两个数组，所以我们设置两个哈希集合
		 Set<Integer> set1=new HashSet<Integer>();
		 Set<Integer> set2=new HashSet<Integer>();
//		 将数组里面的数字遍历到集合中
		 for(int num:nums1) {
			 set1.add(num);
		 }
		 for(int num:nums2) {
			 set2.add(num);
		 }
//		 判断那个集合长度短,就将他当做set1传入到traversal函数里
		 if (set1.size()>set2.size()) {
//			 将两个集合放入到函数里判断，最后返回结果
			return traversal(set2,set1);
		}else {
			return traversal(set1,set2);
		}
	 }
//	 判断函数
	 public int[] traversal(Set<Integer> set1,Set<Integer> set2) {
//		 在设置一个集合存放比较出来的值
		 Set<Integer> set3=new HashSet<Integer>();
//		 通过contains比较
		 for (int num:set1) {
//			 通过判断set2是否存在set1的值来将其存入到set2
			 if (set2.contains(num)) {
//				 由于集合的特点就是不存入重复元素，所以就算set1中有两个2也不会添加两个二
				 set3.add(num);
			 }
		 }
//		 创建一个int类型数组,数组长度就是set3的长度，因为题目要求返回
		 int[] res=new int[set3.size()];
		 int index=0;
		 for(int num:set3) {
			 res[index++]=num;
		 }	 
		 return res;
	}

}
