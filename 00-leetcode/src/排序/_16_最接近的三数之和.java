package 排序;

import java.util.Arrays;

import javax.imageio.ImageTypeSpecifier;

public class _16_最接近的三数之和 {
    public static int threeSumClosest(int[] nums, int target) {
//    	一言不和先排序
    	Arrays.sort(nums);
//    	定义返回数
    	int ans=nums[0]+nums[1]+nums[2];
//    	定义指针
    	int left=0,right=nums.length-1;
    	if (nums.length<=2) {
			return ans;
		}
    	while(right-left>=2) {
    		int pivot=left+1;
    		while(pivot<right) {
    			int sum=nums[left]+nums[right]+nums[pivot];

//    			如果前一个数和后一个数相等就跳出重复
    			if (pivot>left+1&&nums[pivot]==nums[pivot-1]) {
					pivot++;
    				continue;
				}
//    			否则如果sum大于target右边指针往左移
    			else if(sum>target) {
    				right--;
    			}
//    			否则pivot往右移
    			else if(sum<target){
					pivot++;
				}else {
//					否则就是等于，直接返回
					return sum;
				}
//    			将sum和ans减去target的绝对值进行比较，那个小用哪个
    			if (Math.abs(target-sum)<Math.abs(target-ans)) {
					ans=sum;
				}

    		}
    		right=nums.length-1;
    		left++;
    	}
    	return ans;
    }
    public static void main(String args[]) {
    	int[] nums= {-1,2,1,-4};
    	int ans=threeSumClosest(nums, 1);
    	System.out.println(ans);
    }
}
