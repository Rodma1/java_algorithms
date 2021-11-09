package 栈;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*
 * https://leetcode-cn.com/problems/next-greater-element-i/
 */
//通过哈希+栈解决问题
public class _496_下一个更大元素I {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    	int nums1_len=nums1.length;
    	int nums2_len=nums2.length;
//    	设置返回数组
    	int nums[]=new int[nums1_len];
//    	设置栈和哈希函数
    	Stack<Integer> stack=new Stack<>();
    	Map<Integer, Integer> map=new HashMap<Integer, Integer>();
//    	通过遍历nums2将后一个数大于前一个数的元素对应存入到哈希表中
    	
    	for(int i=0;i<nums2_len;i++) {
    		
//    		通过while循环判断要求，如果符合就将两个对应的元素存入哈希表中
    		while(!stack.isEmpty()&& stack.peek()<nums2[i]) {
//    			将栈顶元素作为key,nums2作为value
    			map.put(stack.peek(), nums2[i]);
    			stack.pop();
    		}
//    		将对应元素存入栈中
    		stack.add(nums2[i]);
    	}
//    	遍历完毕后map中就存在对应的大小数值，我们通过for循环判断nums1
    	for(int i=0;i<nums1_len;i++) {
//    		如果哈希表中不存在的key就返回-1
    		nums[i]=map.getOrDefault(nums1[i], -1);
    	}
    	return nums;
    }
}
