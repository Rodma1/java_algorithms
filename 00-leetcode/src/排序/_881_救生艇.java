package 排序;

import java.util.Arrays;

/*
 * 1
 * https://leetcode-cn.com/problems/boats-to-save-people/
 */
//本题用到排序+贪心+双指针
public class _881_救生艇 {
//	先排序，再通过比较第一个数和最后一个数，如果符合就都加一，不符合end减1往前移，船只也加1
    public int numRescueBoats(int[] people, int limit) {
//    	定义需要的船ans,双指针begin和end
    	int ans=0,begin=0,end=people.length-1;
//    	排序
    	Arrays.sort(people);
//    	while循环比较,如果begin的指针大于或等于end的指针，说明循环
    	while(begin>=end) {
//    		如果重量小于limit那么最前后数去除，begin指针往前移
    		if (people[begin]+people[end]<=limit) {
				begin++;
			}
//    		如果大于那就取出最后一个数，指针往前移
    		end--;
//    		船加一个
    		ans++;		
    	}
    	
    	return ans;
    }
}
