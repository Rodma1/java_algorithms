package leetcode周赛;

public class _5890_转换字符串的最少操作次数 {
    public int minimumMoves(String s) {
    	int sum=0;
//    	for(int i=0;i<2;i++) {
//    		if (s.charAt(i)!='O') {
//				sum++;
//				break;
//			}
//    	}
    	int left=0,right=2;
    	for(int i=0;i<s.length();i++) {
    		if (s.charAt(i)!='O') {
    			i+=2;
    			sum++;
			}
    	}
    	return sum;
    }
}
