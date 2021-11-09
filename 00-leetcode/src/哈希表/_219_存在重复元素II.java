package 哈希表;
import java.util.HashMap;


/*
 * 6
 * https://leetcode-cn.com/problems/contains-duplicate-ii/
 */

public class _219_存在重复元素II {
//	使用哈希映射，通过字典的方式，第一个数的值是1，第二个是2，以此类推，如果遇到相同的数，就将他们的值相减
	public static boolean containsNearbyDuplicate(int[] nums, int k) {
		HashMap<Integer, Integer> map=new HashMap<>();
		for (int i=0;i<nums.length;i++) {
//			如果键值中存在，就通过index相减判断
			if (map.containsKey(nums[i])) {
//			通过map.get获取值,题目是至多为k，就是小于等于k
				if (i-map.get(nums[i])<=k) {
					return true;
				}
			}
//			将键值存入
			map.put(nums[i], i);
//			System.out.print(map);
		}
		
		return false;
        
    }
	public static void main(String args[]) {
		int nums[]=new int[5];
		nums[0]=1;
		nums[1]=6;
		nums[2]=2;
		nums[3]=6;
		nums[4]=1;
		System.out.print(nums);
		boolean c=containsNearbyDuplicate(nums,1);
	}
}
