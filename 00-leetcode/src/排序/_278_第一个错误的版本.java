package 排序;

public class _278_第一个错误的版本 {
    public int firstBadVersion(int n) {
        int left=1,right=n,pivot;
        while(left<right) {
        	pivot=left+(right-left)/2;
        	
        	if ( isBadVersion(pivot)) {
        		right=pivot;// 答案在区间 [left, mid] 中
        		
			}else {
				left=pivot+1;// 答案在区间 [mid+1, right] 中
			}
        	
        }
        return left;
    }
    //n=6 bad=4
    /*
     * 123456
     * 第一轮遍历 left=1 pivot=3 right=6 false
     * 第二轮遍历left=4 pivot=5 right=6 true
     * 第三轮遍历 left=4 pivot=4 right=5 true
     * 第四轮遍历 left=4 pivot=4 right=4 true 此时left<right结束循环，返回left
     */

	private boolean isBadVersion(int pivot) {
		// TODO 自动生成的方法存根
		return false;
	}
}
