package leetcode周赛;

public class _2042_检查句子中的数字是否递增 {
    public boolean areNumbersAscending(String s) {
    	String c="";
    	int max=0;
        int j=0;
    	for(int i=0;i<s.length();i++) {

    		if (s.charAt(i)>47&&s.charAt(i)<58) {
				c+=s.charAt(i);
                j=1;
			}
    		
    		if (!c.equals("")&&j==1&&(s.charAt(i)==' '||i+1==s.length())) {
    			if (Integer.parseInt(c)<=max) {
					return false;
				}
                max=Integer.parseInt(c);
			    c="";
                j=0;
			}
      
    	}
    	return true;
    }
}
