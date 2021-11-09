package leetcode周赛;

import java.util.Arrays;
import java.util.List;
/*
 * https://leetcode-cn.com/problems/minimum-operations-to-make-a-uni-value-grid/
 * 具体思路：将二维数组变成一维，通过sort排序，获取中间值，然后在遍历一维获得与中间值的差值
 * ，通过差值跟x作比较就可以获取他的次数了
 */
public class _2033_获取单值网格的最小操作数 {
    public int minOperations(int[][] grid, int x) {
     	int num=0;
    	int m=grid.length;
    	int n=grid[0].length;
    	int[] list=new int[m*n];
    	int c=0;
    	for(int i=0;i<m;i++) {
    		
    		for(int j=0;j<n;j++) {
    			list[c++]=grid[i][j];
    		}
    	}
//    	排序
    	Arrays.sort(list);
        if(list.length==1||list.length==0){
            return 0;
        }
//    	找到中间值
        int pivot=0;
        if(list.length%2==1){
            pivot=list[list.length/2];
        }else if(list.length%2==0) {
           pivot=list[list.length/2-1];
        }
    	
        for(int a : list){
            int l = Math.abs(pivot-a);
            if(l%x != 0) return -1;
            num += l/x;
        }
    	
    	return num;
    }
}
