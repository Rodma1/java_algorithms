package 阿里云周赛;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/*
 * https://tianchi.aliyun.com/oj/589132502606324130/633179267010859822
 *解题思路：我一看到要统计次数我就想到要用哈希，然后他是要按照顺序输出的，这给的题解输出有问题，给我整傻了
 */
public class 查找数组中的所有重复项 {
    public static List<Integer> findDuplicates(int[] nums) {
//    	定义一个返回值
        List<Integer> res=new ArrayList<Integer>();
//    	如果长度小于2说明无法满足两次的要求，直接返回null
    	if (nums.length<2) {
			return res;
		}
//    	定义哈希统计次数
    	HashMap<Integer, Integer> map=new HashMap<>();
    	for(int num:nums) {
    		map.put(num, map.getOrDefault(num, 0)+1);
//    		每遍历一次就判断是否满足两次,如果满足还得判断是否添加过了
    		if (map.get(num)==2&&!res.contains(num)) {
				res.add(num);
			}
    	}

//    	for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
//    	    int i=entry.getValue();
//    	    if (i==2) {
//				res.add(entry.getKey());
//			}
//    	      	    
//    	}
    	return res;
    }
    public static void main(String args[]) {
    	int[] nums= {4,3,2,7,8,3,2,1};
    	List<Integer> res=findDuplicates(nums);
    	System.out.print(res);
    }
}
