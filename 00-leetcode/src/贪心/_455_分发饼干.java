package 贪心;

import java.util.Arrays;

/*
 * https://leetcode-cn.com/problems/assign-cookies/
 * 本题说尽可能多的满足孩纸，就使用贪心算法
 */
public class _455_分发饼干 {
    public int findContentChildren(int[] g, int[] s) {
//    	定义返回值
    	int count =0;
//    	对两个数组进行排序
    	Arrays.sort(g);
    	Arrays.sort(s);
    	int i=0;
//    	通过for循环比较
    	for(int j=0;j<s.length&&i<g.length;j++) {
    		if (s[j]>=g[i]) {
    			i++;
				count++;
			}
    	}
    	return count;
    }
}
