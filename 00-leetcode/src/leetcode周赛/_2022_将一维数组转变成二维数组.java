package leetcode周赛;

public class _2022_将一维数组转变成二维数组 {
    public int[][] construct2DArray(int[] original, int r, int c) {
//    	定义数组
    	int[][] res=new int[r][c];
//    	获取二维数组中一维数组的长度
    	int n=original.length;
        int m=0;
        // 如果不符合转换就直接返回
        if ( m* n != r * c) {
            return null;
        }
//    	通过for循环遍历
    	for(int i=0;i<m*n;i++) {
    		res[i/c][i%c]=original[i%n];
    	}
    	return res;
    }
}
