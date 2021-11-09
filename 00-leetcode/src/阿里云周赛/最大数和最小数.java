package 阿里云周赛;

import java.util.Arrays;

public class 最大数和最小数 {
    public int[] maxAndMin(int[][] matrix) {
        // write your code here
//    	定义最大值和最小值
    	int Max=Integer.MIN_VALUE;
    	int Min= Integer.MAX_VALUE;
//    	通过双重循环获取最大最小值，复杂度O(nxm)
    	for(int[] matr:matrix) {
    		for(int ma:matr) {
    			Max=Math.max(Max, ma);
    			Min=Math.min(Min, ma);
    		}
    	}
    	int[] a= {Max,Min};
    	return a;
    }
}
