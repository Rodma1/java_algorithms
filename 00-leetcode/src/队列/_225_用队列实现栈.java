package 队列;

import java.util.LinkedList;
import java.util.Queue;

/*
 * https://leetcode-cn.com/problems/implement-stack-using-queues/
 * 原理解析：比如有元素[2,9,3]
 * in	out
 * --------
 * 2  	null
 * null 2
 * --------
 * 9	2
 * 29	null
 * null	29
 * --------
 * 3	29
 * 293	null
 * --------
 * 出队:392,完成出栈操作
 */
public class _225_用队列实现栈 {
	Queue<Integer> inqueue;
	Queue<Integer> outqueue;
	/** Initialize your data structure here. 设置队列*/
    public _225_用队列实现栈() {
    	inqueue=new LinkedList<Integer>() ;
    	outqueue=new LinkedList<Integer>();
    }
    
    /** Push element x onto stack. 入队*/
    public void push(int x) {
//    	将输入的一个个x值入队
    	inqueue.offer(x);
//    	if(outqueue)
//    	循环判断outqueue是否为空
    	while(!outqueue.isEmpty()) {
    		inqueue.offer(outqueue.poll());
    	}
//    	设置指针temp,然后将inqueue和outqueue的值相互替换
    	Queue<Integer> temp=inqueue;
//    	这里道理相当于重新将inqueue的值设置为空，因为outqueue会将值poll出栈
    	inqueue=outqueue;
//    	将入队的值存入outqueue
    	outqueue=temp;
    }
    
    /**出队 Removes the element on top of the stack and returns that element. */
    public int pop() {
    	return outqueue.poll();
    }
    
    /** Get the top element. */
    public int top() {
    	return outqueue.peek();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
    	return outqueue.isEmpty();
    }
}
