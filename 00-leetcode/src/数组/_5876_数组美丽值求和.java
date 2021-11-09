package 数组;
//滑动窗口
public class _5876_数组美丽值求和 {
    public int sumOfBeauties(int[] nums) {
//    	
    	int count=0;

    	int left=0,right=2;
    	int max_left=0;
    	while(right<nums.length) {
    		int pivot=left+1;
    		if (nums[left]<nums[pivot]&&nums[pivot]<nums[right]) {
    			
				if (nums[left]>max_left) {
					count++;
					max_left=nums[left];
		    		left++;
		    		right++;
					break;
				}
				int right2=right;
				while(++right2<nums.length) {
					
					if (nums[right2]<=nums[pivot]) {
						count++;
						break;
					}

//					if (left2>0&&nums[left2]>=nums[pivot]) {
//						count++;
////						break;
//					}
					
				}

				if (right2==nums.length) {
					count+=2;
				}
				
			}
    		left++;
    		right++;
    	}
    	
    	
    	return count;
    }
}
