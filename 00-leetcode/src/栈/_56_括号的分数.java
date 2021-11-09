package 栈;

import java.util.Stack;

/*
 * 2
 * ◼ 括号的分数
https://leetcode-cn.com/problems/score-of-parentheses
◼ 基本计算器
https://leetcode-cn.com/problems/basic-calculator/comments/
 */
public class _56_括号的分数 {
	public int scoreOfParentheses(String s) {
//		创建一个栈
		Stack<Integer> stack = new Stack();
		
//		存入一个0,为了接下来弹出栈判断得分准备
		stack.push(0);
		int len=s.length();
		for (int i=0;i<len;i++) {
			char c=s.charAt(i);
//			按照题目要求，我们将存入的(设置为0
			if (c=='(') {
				stack.push(0);
			}else {
//				如果遇到),就弹出栈,且我们将当前深度的得分乘二并加到上一层的深度。
				int top=stack.pop();//这是栈的第一层
    			int second=stack.pop();//这是栈的第二层
//    			AB 得 A + B 分，其中 A 和 B 是平衡括号字符串。
//    			题目要求,如果top是(),需要乘2
    			stack.push(second+Math.max(top*2, 1));
			}
		}
		return stack.pop();
    }	
}
