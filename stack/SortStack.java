package com.stack;

import java.util.Stack;

public class SortStack {
	public static void sortedInsert(Stack<Integer> stack, int item) {
		if (stack.isEmpty() || item > stack.peek()) {
			stack.push(item);
			return;
		}
		int top = stack.pop();
		sortedInsert(stack, item);
		stack.push(top);
	}

	public static void sort(Stack<Integer> stack) {
		if (stack.isEmpty())
			return;
		int top = stack.pop();
		sort(stack);
		sortedInsert(stack, top);
	}

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(30);
		stack.push(-5);
		stack.push(18);
		stack.push(14);
		stack.push(-3);

		sort(stack);
		System.out.println("Sorted Stack: " + stack);
	}
}
