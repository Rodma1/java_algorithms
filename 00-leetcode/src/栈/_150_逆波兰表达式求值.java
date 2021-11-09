package 栈;

import java.util.Deque;
import java.util.HashMap;
import java.util.Stack;

/*
 * 3
 * https://leetcode-cn.com/problems/evaluate-reverse-polish-notation/
 */
public class _150_逆波兰表达式求值 {
	 public int evalRPN(String[] tokens) {
//		 创建一个空栈
		 	Stack<Integer> stack=new Stack<>();
//		 	int len=;
			
		 	for(int i =0;i<tokens.length;i++) {
		 		String token=tokens[i];
		 		if (!("+".equals(token) || "-".equals(token) || "*".equals(token) || "/".equals(token))) {
//		 			解析为整数
		 			stack.push(Integer.parseInt(token));
		 		}
//		 		如果碰上操作符
		 		else {
//		 			出栈两个数
		 			int num2=stack.pop();
		 			int num1=stack.pop();
//		 			通过switch判断用什么
		 			switch(token) {
		 			case "+":
		 				stack.push(num1+num2);
		 				break;
		 			case "-":
		 				stack.push(num1-num2);
		 				break;
		 			case "*":
		 				stack.push(num1*num2);
		 				break;
		 			case "/":
		 				stack.push(num1/num2);
		 				break;
		 			default:
		 			}
		 		}
		 	}
		 	return stack.pop();	
	    }
}
