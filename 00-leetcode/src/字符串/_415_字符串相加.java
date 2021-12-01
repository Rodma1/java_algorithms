package 字符串;

/**
 * https://leetcode-cn.com/problems/add-strings/
 * 双指针+模拟
 */
public class _415_字符串相加 {
    // 想要获取整数，每个字符减去字符0就可以
    public String addStrings(String num1, String num2) {
        // 我们要从后面往前面取出字符相加，这样子才能够保持顺序
        int i=num1.length()-1,j=num2.length()-1;
        // add是保存进位的数
        int add=0;
        // 初始化字符集
        StringBuilder string=new StringBuilder();
        // 一次遍历
        while(i>=0||j>=0||add!=0){
            int result =0;
            //获取数字
            int x=i>=0?num1.charAt(i)-'0':0;
            int y=j>=0?num2.charAt(j)-'0':0;
            result=x+y+add;
            string.append(result%10);
            // 除10判断是否有进制
            add=result/10;
            i--;
            j--;
        }
        // 翻转
        string.reverse();
        return string.toString();
    }
}
