package leetcode周赛;

public class 双周赛三 {
	class Solution {
	    public int maxConsecutiveAnswers(String answerKey, int k) {
	    	char pivot=answerKey.charAt(0);
	    	int max=0;
	    	int sum=0;
	    	int left=0;
	    	int j=k;
	    	for(int i=1;i<answerKey.length();i++) {
	    		if (pivot!=answerKey.charAt(i)) {
					if (j!=0) {
						if (j==k) {
							left=i;
						}
						j--;
						sum++;
						continue;
					}else {
						pivot=answerKey.charAt(left);
						j=k;
						max=Math.max(sum, max);
					}
				}
	    		sum++;
	    		
	    	}
	    	return Math.max(sum, max);
	    }
	}
}
