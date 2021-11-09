package 队列;

import java.util.Stack;

public class _面试题03_04_化栈为队 {
//	思路:设置两个栈,一个栈负责入栈,一个栈负责出栈
	private Stack<Integer> instack;
	private Stack<Integer> outstack;
	public _面试题03_04_化栈为队() {
		instack=new Stack<>();
		outstack=new Stack<>();
	}
//	入栈
	public void push(int x) {
		instack.push(x);
	}
//	出栈
	public int pop() {
//		如果出栈的栈为空
		if (outstack.isEmpty()) {
//			通过循环将第一个栈的元素放入到第二个栈中
			while(!instack.isEmpty()) {
				outstack.push(instack.pop());
			}
		}
//		出栈
		return outstack.pop();
	}
//	获取栈顶元素
	public int peek() {
//		如果出栈的栈为空
		if (outstack.isEmpty()) {
//			通过循环将第一个栈的元素放入到第二个栈中
			while(!instack.isEmpty()) {
				outstack.push(instack.pop());
			}
		}
		return outstack.peek();
	}
//	判断是否为空
	public boolean empty() {
		return instack.isEmpty()&& outstack.isEmpty();
	}
}
