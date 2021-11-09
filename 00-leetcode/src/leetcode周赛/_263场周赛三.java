package leetcode周赛;

public class _263场周赛三 {
    public int countMaxOrSubsets(int[] nums) {
       	int max=0;
    	int sum=0;
    	
    	for(int i=0;i<nums.length;i++) { 
    		int left=i;
    		while(left<nums.length) { 
    			int c=0;

    			left++;
    			int left1=left;
    			while(left1<=nums.length) {

    				c=nums[i]|nums[left1];

                    System.out.println(c);
    				if (max==c) {
    					sum++;
    				}else if (max<c) {
                        sum=1;
    					max=c;
    					
    				}
    				left1++;
    			}
    			
    		}
            if(nums[i]==max){
                sum++;
            }
    	}

    	return sum;
    }
	public static void main(String[] args) {
		int i=2|2;
		System.out.println(i);
	}
}
