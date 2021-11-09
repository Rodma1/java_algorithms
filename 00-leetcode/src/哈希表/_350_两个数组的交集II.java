package 哈希表;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.swing.SpringLayout.Constraints;

public class _350_两个数组的交集II {
	public static int[] intersect(int[] nums1, int[] nums2) {
		if (nums1.length > nums2.length) {
	            return intersect(nums2, nums1);
	      }
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//        通过for循环将获取到的数据存入到哈希表中，如果出现重复的数据就+1
        for (int num : nums1) {
        	System.out.print(num);
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, map.getOrDefault(num, 0)+1);
        }
//        定义存放返回的数组
        int[] intersection = new int[nums1.length];
        System.out.print(map);
        int index = 0;
        for (int num : nums2) {
//        	获取对应键的值
            int count = map.getOrDefault(num, 0);
//            如果键值大于0就存入数组中
            if (count > 0) {
            	System.out.println(count);
                intersection[index++] = num;
                count--;
        		System.out.print(num);
        		
//                重新更新哈希
                if (count > 0) {
                    map.put(num, count);
                } else {//否则就移除
                    map.remove(num);
                    System.out.println(map);
                }
            }
           
        }
//        array=Arrays.copyOfRange(oringinal,int from, int to) 此时要注意下标的变化，
//array拷贝original数组从from下标开始，一直到to下标结束，注意包含from下标，不包含to下标，是左闭右开区间。
        System.out.println(index);
//        提取0~index的数组长度就可以了,因为后面没有值了
        return Arrays.copyOfRange(intersection, 0, index);
    }
	public static void main(String args[]) {
		int nums1[]=new int[3];
		int nums2[]=new int[5];
		nums1[0]=4;
		nums1[1]=9;
		nums1[2]=5;
		nums2[0]=9;
		nums2[1]=4;
		nums2[2]=9;
		nums2[3]=8;
		nums2[4]=4;
//		System.out.print(nums1);
		int[] c=intersect(nums1, nums2);
		for(int num:c) {
			System.out.print(num);
		}
	}
}
