package 双指针;

public class _167_两数之和II输入有序数组 {
//    通过双指针解决问题
	public int[] twoSum(int[] numbers, int target) {
		int len=numbers.length;
		int left=0,right=len-1;
//		题目已经要求返回长度为2的数组
		int[] ans=new int[2];
//		循环比较，如果相等或left大于right就终止
		while(left<right) {
//			如果左右指针元素相加等于target,就返回他们的下标
			if (numbers[left]+numbers[right]==target) {
//				题目要求返回下标加一
				ans[0]=left+1;
				ans[1]=right+1;
				return ans;
			}
//			如果相加小于target那么右指针就向右移动变小
			else if (numbers[left]+numbers[right]>target) {
				right--;
			}else {
//				如果小于target左指针向左移动
				left++;
			}
			
		}
		return ans;
    }
}
