package 排序;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/*
 * https://leetcode-cn.com/problems/merge-intervals/
 */
public class _56_合并区间 {
    public int[][] merge(int[][] intervals) {
//        如果长度为零直接返回
    	if (intervals.length==0) {
			return new int[0][2];
		}
//        先排序,按照start排列
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
//        定义一个列表
        List<int[]> list=new ArrayList<int[]>();
//      通过for循环遍历数组,如果前一个数组得end比第二个数组得start小，
//        说明两个没有集合，直接存入list,否则就要获取他们end最大得数合并
        for(int[] interval:intervals) {
//        	刚开始如果list为空就先进入，前一个数组得end比第二个数组得start小，也加入因为没有集合
        	if (list.isEmpty()||list.get(list.size()-1)[1]<interval[0]) {
				list.add(interval);
			}
//        	否则就是他们有集合，合并他们两个数存入list
        	else {
//        		修改end的值
        		list.get(list.size()-1)[1]=Math.max(list.get(list.size()-1)[1], interval[1]);
        	}
        }
//       最后将其变成二维数组输出
    	return list.toArray(new int[list.size()][]);
   }
}
