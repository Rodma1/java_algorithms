package 数组;
/*
 * https://leetcode-cn.com/problems/corporate-flight-bookings/
 */
public class _1109_航班预订统计 {
//	求一个区间的增量叠加,可以用差分的方法
    public int[] corpFlightBookings(int[][] bookings, int n) {
//    	定义一个数组
    	int[] res=new int[n];
//    	通过for循环遍历二维数组
    	for(int[] booking:bookings) {
//    		将区间开头的编号预定记录存入
    		res[booking[0]-1]+=booking[2];
//    		如果该数组最后的区间小于n，那么说明还没有到最大,并且该区间没有booking[2]这个元素值,那么减去就行了
    		if (booking[1]<n) {
				res[booking[1]]-=booking[2];
			}
    	}
/*
	解释：bookings = [[1,2,10],[2,3,20],[2,5,25]], n = 5
	数组编号  ：      0   1   2   3   4
	第一数组  ：     10  	 -10
	第二数组  ：      	  20  	 -20
	第三数组  ：     	  25		   0
	因此，res = [10,45,-10,-20,0]

*/
//    	遍历完成后，在遍历相邻的两个数求分差就可以直到结果了
    	for(int i=1;i<n;i++) {
//    		后一个数加上前一个数
    		res[i]+=res[i-1];
    	}
/*
	数组编号  ：      0   1   2   3   4
	第一:res = [10,55,-10,-20,0]
	第二:res = [10,55,45,-20,0]
	第三:res = [10,55,45,25,0]
	第四:res = [10,55,45,25,25]
 */
    	return res;
    }
}
