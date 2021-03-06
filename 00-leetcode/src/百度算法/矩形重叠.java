package 百度算法;
/*
 * https://tianchi.aliyun.com/oj/570479274615099874/602158552971416295
 */
public class 矩形重叠 {
	class Point {
		 int x;
		 int y;
		 Point() { x = 0; y = 0; }

		 Point(int a, int b) { x = a; y = b; }
	}
	public class Solution {
	    /**
	     * @param l1: top-left coordinate of first rectangle
	     * @param r1: bottom-right coordinate of first rectangle
	     * @param l2: top-left coordinate of second rectangle
	     * @param r2: bottom-right coordinate of second rectangle
	     * @return: true if they are overlap or false
	     */
	    public boolean doOverlap(Point l1, Point r1, Point l2, Point r2) {
	        // write your code here
//	        如果左右脚的x坐标都超过或者y轴那么就返回true
	    	if ((l2.x>l1.x&&r2.x>r1.x)||(l2.y>l1.y&&r2.y>r1.y)) {
				return true;
			}

	    	return false;
	    }
	}
}
