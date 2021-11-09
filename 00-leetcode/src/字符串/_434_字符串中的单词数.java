package 字符串;
/*
 * https://leetcode-cn.com/problems/number-of-segments-in-a-string/
 */
public class _434_字符串中的单词数 {
    public int countSegments(String s) {
//    	定义叠加数量
    	int num=0;
//    	定义flag判断是否遇到空值
        int flag=0;
//        for循环遍历
    	for(int i=0;i<s.length();i++) {
//    		如果遇到没空值就加加
    		if (s.charAt(i)!=' '&&flag==0) {
				num++;
                
                flag=1;
			}
//    		如果遇到空值在重置
            else if(s.charAt(i)==' '){
                flag=0;
            }
    	}
        return num;
    }
}
