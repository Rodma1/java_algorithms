package 排序;

public class _35_搜索插入位置 {
	//二分查找
    public int searchInsert(int[] nums, int target) {
    		
        int left=0,right=nums.length-1,pivot,ans=nums.length;

        while(left<=right) {
//        	这里相当于除于二，取一半
        	pivot=((right - left) >> 1) + left;

        	if (target>nums[pivot]) {
				left=pivot+1;
			}else {
//				通过ans获取下标
				ans=pivot;
				right=pivot-1;
			}
        }
    	return ans;
    }
}
/*
 * 假设案例 [1,3,5,6] target=2
 * 第一轮遍历开始:left=0,right=3 ans=4，pivot=1
 * 第二轮遍历开始:left=0,right=0 ans=1 pivot=0
 * 第三轮遍历开始:left=1 right=0 由于left>right遍历结束，返回ans就是目标值的下标
 */
