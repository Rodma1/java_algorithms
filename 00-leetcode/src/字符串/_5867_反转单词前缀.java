package 字符串;

public class _5867_反转单词前缀 {
//	找到下标d直接通过双指针反转就可以了
    public String reversePrefix(String word, char ch) {
    	int left=0,right=0;
    	StringBuffer s = new StringBuffer(word);
    	for(;right<word.length();) {
    		if (word.charAt(right)==ch) {
    			break;
			}
    		right++;
    	}
//    	如果超出了说明没有匹配的字符
    	if (right>=word.length()) {
			return word;
		}else {
			
			while(left<right) {
//				通过while交换
		        char temp = s.charAt(right);
		        s.setCharAt(right,s.charAt(left));
		        s.setCharAt(left,temp);
		        left++;
		        right--;
				
			}
		}
    	return s.toString();
    	
    	
    }
}
