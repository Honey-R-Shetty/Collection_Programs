package com.stack;

import java.util.Stack;

public class PushAtBottom {
	public static void pushAtBottom(Stack stack,int data) {
		if(stack.isEmpty()) {
			stack.push(data);
			return;
		}
		int top = (int) stack.pop();
		pushAtBottom(stack, data);
		stack.push(top);
	}
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		pushAtBottom(stack, 4);
	}
}
