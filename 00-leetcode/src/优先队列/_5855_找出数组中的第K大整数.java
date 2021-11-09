package 优先队列;

import java.util.Arrays;

public class _5855_找出数组中的第K大整数 {
    public String kthLargestNumber(String[] nums, int k) {
//自定义排序
    	Arrays.sort(nums, ((o1, o2) -> {
            if (o1.length() > o2.length())
                return -1;
            else if (o1.length() < o2.length())
                return 1;
            else
                return o2.compareTo(o1);
        }));
        return String.valueOf(nums[k - 1]);
    }
}
