package 排序;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _15_三数之和 {
    public List<List<Integer>> threeSum(int[] nums) {
//    	设定一个二维列表
    	List<List<Integer>> res=new ArrayList<List<Integer>>();
//    	排序
    	Arrays.sort(nums);
//    	初始化指针
    	int left=0;

//    	while循环直到左指针大于0结束
    	while(left<nums.length&&nums[left]<=0) {
//    		定义一个可以在左右指针中间遍历的指针
    		int pivot=left+1;
//    		定义右指针
            int right=nums.length-1;

//    		如果前一个数和后一个数相等那么跳过循环去除重复值
    		if (left>0&&nums[left]==nums[left-1]) {
    			left++;
				continue;
			}
//    		如果pivot等于right就结束循环
    		while(pivot<right) {
//    			如果有重复的数就退出
        		if (pivot>left+1&&nums[pivot]==nums[pivot-1]) {
					pivot++;
                    continue;
				}
//        		如果符合条件
        		else if (nums[left]+nums[pivot]+nums[right]==0) {
//    				将这三个数存入列表,在存入二维列表
        			res.add(new ArrayList<Integer>(Arrays.asList(nums[left],nums[pivot],nums[right])));
                    pivot++;
                    right--;
    			}
//        		否则如果大于num>0,说明右边的数太大right--
        		else if (nums[left]+nums[pivot]+nums[right]>0) {
    				right--;
    			}
//        		否则如果小于0,说明左边数太小pivot++
        		else {
    				pivot++;
    			}
    		}
//    		left加一继续判断
    		left++;

    	}
    	return res;
    }
    public static void main(String args[]) {
    	int[] nums= {-1,0,1,2,-1,-4};
    }
}
/*
 * 思路：[-1,0,1,2,-1,-4]
 * 排序sort:[-4,-1,-1,0,1,2]
 * 设定两个指针left 和 right在定义他们中间移动的数pivot
 * 如果left+pivot+right==0那么pivot=++,right--
 * 如果pivot==right结束循环,进行下一循环left++ pivot=left+1
 */