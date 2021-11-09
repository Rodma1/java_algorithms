package 贪心;

import java.util.Arrays;
import java.util.Comparator;

/*
 * https://leetcode-cn.com/problems/minimum-number-of-arrows-to-burst-balloons/
 * 由题目可以知道，如果这些坐标有集合，那么一定会一箭射中也就是Xend>=X2start
 */
public class _452_用最少数量的箭引爆气球 {
    public int findMinArrowShots(int[][] points) {
        if (points.length==1) {
			return 1;
		}
//    	设定返回值
    	int count=0;
//    	先小到大排序
    	Arrays.sort(points, new Comparator<int[]>() {
            public int compare(int[] point1, int[] point2) {
                if (point1[0] > point2[0]) {
                    return 1;
                } else if (point1[0] < point2[0]) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
    	
//    	获取第一个元素
    	int[] p=points[0] ;
//    	从第二个元素开始遍历判断
    	for(int i=1;i<points.length;i++) {
//    		如果小于start，说明没有集合
    		if (p[1]<points[i][0]) {
				count++;
				p=points[i];

			}else {//否则就是有集合
//				找出集合中最小的end
				if (p[1]>points[i][1]) {
					p=points[i];
				}
			}
    	}
//    	每次遍历到最后一个count都不能++，所以要返回count+1
    	return count+1;
    }
}
