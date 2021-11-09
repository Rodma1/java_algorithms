package com.chen;

public class Main {
	public static void main(String[] args) {
		System.out.println(11);
		Stack<Integer> stack=new Stack<>();
		stack.push(11);
		stack.push(12);
		stack.push(13);
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
	}
}
