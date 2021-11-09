package 队列;

import java.util.Stack;

/*
 * 1
 * https://leetcode-cn.com/problems/implement-queue-using-stacks/
 * 请你仅使用两个栈实现先入先出队列。
 */
public class _232_用栈实现队列 {
//	设置栈，由于他是int类型的元素，所以这里用Integer
	private  Stack<Integer> inStack;
	private  Stack<Integer> outStack;
	/** Initialize your data structure here. 设置两个栈*/
    public _232_用栈实现队列() {
//    	new两个栈
    	inStack=new Stack<>();
    	outStack = new Stack<>();
    }
    
    /** Push element x to the back of queue. 入队*/
    public void push(int x) {
    	inStack.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element.出队 */
    public int pop() {
//    	通过判断两个栈是否为空来做出入栈出栈操作
    	if (outStack.isEmpty()) {
			while(!inStack.isEmpty()) {
				outStack.push(inStack.pop());
			}
		}
    	return outStack.pop();
    }
    
    /** Get the front element.获取队头元素 */
    public int peek() {
    	if (outStack.isEmpty()) {
			while(!inStack.isEmpty()) {
				outStack.push(inStack.pop());
			}
		}
//    	jdk官方获取栈顶元素用peek
    	return outStack.peek();
    }
    
    /** Returns whether the queue is empty.是否为空 */
    public boolean empty() {
    	return inStack.isEmpty() && outStack.isEmpty();
    }
    
}
