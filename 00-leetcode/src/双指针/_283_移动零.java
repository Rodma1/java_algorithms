package 双指针;
/*
 * https://leetcode-cn.com/problems/move-zeroes/
 */
public class _283_移动零 {
//通过双指针，首先都指向0坐标，如果遇到非零数就互相交换，否则右指针向右移动
    public void moveZeroes(int[] nums) {
    	int left=0,right=0;
//    	循环终止是right到达最右边时候
    	while(right<nums.length) {
    		if (nums[right]!=0) {
//    			交换顺序
				swap(nums, left, right);
				left++;
				right++;
			}else {
//				否则向右移动
				right++;
			}
    	}
    }
    public void swap(int[] nums,int left ,int right) {
//    	这里的nums[left]一直都是0，除了第一个
    	int temp=nums[right];
    	nums[right]=nums[left];
    	nums[left]=temp;
    }
}
/*
 * 解析：0 0 3 0 1 2
 * 第一次循环开始:left=0 right=0 nums[left]=0 nums[right]=0	 nums=0
 * 第二次循环开始:left=0 right=1 nums[left]=0 nums[right]=0  nums= 0 0
 * 第三次循环开始:left=0 right=2 nums[left]=0 nums[right]=3  这时候交换位置nums= 3 0 0
 * 第四次循环开始:left=1 right=3 nums[left]=0 nums[right]=0  nums =3 0 0 0
 * 第五次循环开始：left=1 right=4  nums[left]=0 nums[right]=1  这时候交换位置nums =3 1 0 0 0
 * 第六次循环开始:left=2 right=5  nums[left]=0 nums[right]=2  这时候交换位置nums =3 1 2 0 0 0
 * 最后right=6>n
*/