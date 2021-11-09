package 哈希表;

import java.util.HashMap;
import java.util.Map;

/*
 * https://leetcode-cn.com/problems/number-of-boomerangs/
 * 解题思路：
 * 1. 一个个点遍历，通过两点之间确定距离公式k^2=(y1-x1)^2+(x1-x2)^2获取距离
 * 2. 通过哈希遍历保存每两个点的距离，要是相同就加一
 * 3. 在遍历哈希获取每个距离统计的次数n,通过公式n(n-1)获取排列次数
 */
public class _447_回旋镖的数量 {
    public int numberOfBoomerangs(int[][] points) {
//    	定义一个返回值
    	int sum=0;
//		遍历每一个点
    	for(int i=0;i<points.length;i++) {
//    		将每两个点的距离存入哈希.相同的距离就加一
//			设置哈希
			HashMap<Integer, Integer> map=new HashMap<>();
    		for(int j=0;j<points.length;j++) {

//    			获取距离
    			int distance=(points[i][0]-points[j][0])*(points[i][0]-points[j][0])
    					+(points[i][1]-points[j][1])*(points[i][1]-points[j][1]);
//    			存入哈希
    			map.put(distance, map.getOrDefault(distance, 0)+1);
    		}
    		System.out.print(map);
//        	遍历完后就开始遍历哈希,因为已经知道每个j点跟i点距离的次数了，获取这些j点的排雷顺序就可以了
        	for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
        		int value=entry.getValue();
//        		如果更i点距离相同的次数大于1就能排序
        		if (value>1) {
					sum+=value*(value-1);
				}
        	}
    	}

    	return sum;
    }
}
