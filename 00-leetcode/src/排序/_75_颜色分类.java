package 排序;

import java.util.Arrays;
/*
 * https://leetcode-cn.com/problems/sort-colors/
 * 定义三个指针,red,white,blue,如果遇到white往前移动，
 * 如果遇到0就和red交换，red++.如果遇到2就和blue交换,遇到1就继续white++
 */
public class _75_颜色分类 {
    public void sortColors(int[] nums) {
    	int red=0,white=0,blue=nums.length-1;
//    	while循环，直到white超过blue
    	while(white<=blue) {
//    		如果red为零就不用交换,直接++，并且将white放到red一起
            if(nums[red]==0){
                red++;
                if(white<red){
                    white=red;
                }
                continue;
            }
//    		如果blue为2就不用交换,直接++
            if(nums[blue]==2){
                blue--;
                continue;
            }
//            如果white位置是2，那么就和blue位置交换
    	    if(nums[white]==2){
				sort(nums, white, blue);
                blue--;
			}
//          如果white位置是0，那么就和red位置交换
            else if (nums[white]==0) {
				sort(nums, white, red);

                red++;
			}
//    	    遇到1就++
            else {
				white++;
			}
    	}
    }
    public void sort(int[] nums,int white,int num) {
    	int temp=nums[white];
		nums[white]=nums[num];
		nums[num]=temp;
    }
}
