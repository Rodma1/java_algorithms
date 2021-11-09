package 字符串;

/*
 * https://leetcode-cn.com/problems/split-a-string-in-balanced-strings/
 */
public class _1221_分割平衡字符串 {
//	双指针
    public int balancedStringSplit(String s) {
//    	由于他给的字符串是平衡字符串，所以我们可以通过双指针直接判断
    	int ans=0;
//    	定义双指针
    	int left=0,right=1;
    	
    	int sum=0;
//    	由于最后面会出现RL情况，所以right要等于s.leng
    	while(right<=s.length()) {
//	如果sum等于-1,说明有前面一个平衡字符
    		if (sum==-1) {
				ans++;
				left=right;
				sum=0;
//	    		如果两个数等于，那么right就加加
			}else if(s.charAt(left)==s.charAt(right)){
				sum++;
			}else {//否则sum减减
				sum--;
			}
    		right++;
    	}
    	return ans;
    }
    
    
//    解法2贪心
    public int balancedStringSplit2(String s) {
//    	由于自由R和L两个字符,设定一个变量，如果是R就++，是L就--,如果是零就增加一个平衡字符
    	int ans=0,L=0;
//    	for循环遍历字符
    	for(int i=0;i<s.length();i++) {
    		char c=s.charAt(i);
    		if (c=='L') {
				L++;
			}else {
				L--;
			}
    		if (L==0) {
				ans++;
			}
    	}
    	return ans;
    }
}
