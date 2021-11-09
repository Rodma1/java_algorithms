package 双指针;

public class _557_反转字符串中的单词III {
//	这里可以使用双指针解决,当右指针指向空格时候就反转字符,然后左指针在指向右指针前一位
    public static String reverseWords(String s) {
//    	使用额外空间
    	StringBuilder ret=new StringBuilder();
//    	初始化指针，右指针总是在左指针前
    	int left=0,right=0;
    	while(right<s.length()) {
//    		如果右指针等于空格
    		System.out.println(s.charAt(right));
    		if (s.charAt(right)==' ') {
//				开始逆序遍历存入ret
    			int pivot=right-1;
    			while(left<=pivot) {
    				ret.append(s.charAt(pivot));
    				pivot--;
    			}
    			ret.append(s.charAt(right));
    			left=right+1;
			}else if(right+1==s.length()){
//				开始逆序遍历存入ret
    			int pivot=right;
    			while(left<=pivot) {
    				ret.append(s.charAt(pivot));
    				pivot--;
    			}
			}
    		right++;
    	}
    	return ret.toString();
    }
    
    public static void main(String[] args) {
    	String string="Let's take LeetCode contest";
    	String string2=reverseWords(string);
    	System.out.print(string2);
    }
}
