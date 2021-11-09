package leetcode周赛;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
/*
 * https://leetcode-cn.com/problems/two-out-of-three/
 * 先通过哈希表获取第一个nums
 */
public class _2032_至少在两个数组中出现的值 {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
    	List<Integer> list=new ArrayList<Integer>();
    	HashMap<Integer,Integer> map=new HashMap<>();
//    	循环遍历一个数组
    	for(int nums:nums1) {
    		map.put(nums, 1);
    	}
//    	遍历查看nums2里面是否有元素在map里
    	for(int nums:nums2) {
//    	如果有且list没有，且value为1
    		if (map.containsKey(nums)&&map.get(nums)==1&&!list.contains(nums)) {
//				增加元素
    			list.add(nums);
//    			将value改为0
				map.put(nums,map.getOrDefault(nums, 0));
			}
//    		存入数组2的元素
    		if (!map.containsKey(nums)) {
				map.put(nums, 2);
			}
    	}
    	for(int nums:nums3) {
    		if (map.containsKey(nums)&&map.get(nums)==1&&!list.contains(nums)) {
				list.add(nums);
				map.getOrDefault(nums, 0);
			}else if (map.containsKey(nums)&&map.get(nums)==2&&!list.contains(nums)) {
				list.add(nums);
				map.put(nums,map.getOrDefault(nums, 0));
			}
    	}
    	return list;
    }
}
