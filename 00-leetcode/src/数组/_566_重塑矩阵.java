package 数组;
/*
 * https://leetcode-cn.com/problems/reshape-the-matrix/submissions/
 */
public class _566_重塑矩阵 {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
//    	定义数组
    	int[][] res=new int[r][c];
//    	获取二维数组中一维数组的长度
    	int n=mat[0].length;
        int m=mat.length;
        // 如果不符合转换就直接返回
        if ( m* n != r * c) {
            return mat;
        }
//    	通过for循环遍历
    	for(int i=0;i<m*n;i++) {
    		res[i/c][i%c]=mat[i/n][i%n];
    	}
    	return res;
    }
}
