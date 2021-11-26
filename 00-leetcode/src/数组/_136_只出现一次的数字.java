package 数组;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _136_只出现一次的数字 {
    /**
     * 使用集合
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int sum=0;
        for (int num :nums){
            if (set.contains(num)){
                set.remove(num);
                continue;
            }
            set.add(num);
        }
//        遍历出集合
//        for (int num:set){
//            sum=num;
//        }
        return set.hashCode();
    }

    /**
     * 排序加遍历
     * @param nums
     * @return
     */
    public int singleNumber1(int[] nums) {
//        排序
        Arrays.sort(nums);
//        两个两个遍历
        for (int i=0;i<nums.length-1;i+=2){
//            如果不等于那么就取左边的
            if (nums[i]!=nums[i+1]){
                return nums[i];
            }
        }
//        如果是在最后一个就直接返回
        return nums[nums.length-1];
    }
    /**
     * 位运算
     * 通过异或解决
     * 1. 任何数和其自身做异或运算，结果是 00
     * 2. 任何数和 0 做异或运算，结果仍然是原来的数
     * 通过以上两点我想应该有思路了
     */
    public int singleNumber2(int[] nums) {
        int single=0;
        for (int num:nums){
//            做异或，如果是相同的数就变为0了
            single^=num;
        }
        return single;
    }

}
