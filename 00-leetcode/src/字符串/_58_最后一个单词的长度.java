package 字符串;

import java.awt.print.Printable;

public class _58_最后一个单词的长度 {
//	分割字符
    public static  int lengthOfLastWord(String s) {
    	String[] string=s.split(" ");
//    	System.out.print(string[string.length-1].length());
    	return string[string.length-1].length();
    }
//    迭代
    public int lengthOfLastWord1(String s) {
    	int res = 0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i) == ' ' && res !=0 ){
                break;
            }
            if(s.charAt(i)!=' '){
                res ++;
            }
        }
        return res;
    }
    public static void main(String args[]) {
    	String s="Hello World";
    	lengthOfLastWord(s);
    }
    
}
