package 字符串;

import java.util.Stack;
/*
 * https://leetcode-cn.com/problems/valid-parenthesis-string/
 */
public class _678_有效的括号字符串 {
//	通过栈来判断,左括号星号入栈，入栈的元素是他们的下标，遇到右括号就出栈，
//	最后判断栈是否为空，如果不为空左括号下标是否大
    public boolean checkValidString(String s) {
//    	设置两个栈
    	Stack<Integer> left_stack=new Stack<>();
    	Stack<Integer> planet_stack=new Stack<>();
//    	循环下标如果是(和*就入栈,是）就取出(匹配,如果(栈为空,就取出*做匹配,两个都为空就返回false
    	for(int i=0;i<s.length();i++) {
    		char character=s.charAt(i);
//    		如果是左括号就存入下标
    		if (character=='(') {
				left_stack.push(i);
			}else if(character=='*') {
				planet_stack.push(i);
			}else {
//				否则如果（栈不为空就匹配）
				if (!left_stack.isEmpty()) {
					left_stack.pop();
				}else if (!planet_stack.isEmpty()) {
					planet_stack.pop();
				}else {
					return false;
				}
			}

    	}
//		上面的是匹配了),可是如果栈left和planet不为空,还得要通过planet匹配
		while(!left_stack.isEmpty()&&!planet_stack.isEmpty()) {
			int left=left_stack.pop();
			int planet=planet_stack.pop();
//			如果left的下标大于planet下标，说明在 plant后面，无法匹配
			if (left>planet) {
				return false;
			}
		}
//		如果遍历完毕没有异常,且left为空，就返回true否则false
    	
    	return left_stack.isEmpty();
    }
}
