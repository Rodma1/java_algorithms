package 排序;

public class _704_二分查找 {
	public int search(int[] nums, int target) {
//		定义两个左右指针,和他们中间的下表pivot
		int left=0,right=nums.length-1,pivot=right/2;
//		如果while循环成立就终止
		while(left <= right) {
			if (nums[pivot] == target) return pivot;
			if (nums[pivot]<target) {
				left=pivot+1;
//				求出他们中间结点
				pivot=(right-left)/2+left;
			}else {
//				将right移到pivot那里去
				right=pivot-1;
//				求出他们中间结点
				pivot=(right-left)/2+left;
			}
		}
		return -1;
	}
}
