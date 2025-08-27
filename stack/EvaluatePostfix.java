package com.stack;

import java.util.*;

public class EvaluatePostfix {
	public static int evaluate(String expr) {
		Stack<Integer> stack = new Stack<>();
		for (char c : expr.toCharArray()) {
			if (Character.isDigit(c)) {
				stack.push(c - '0');
			} else {
				int b = stack.pop();
				int a = stack.pop();
				switch (c) {
				case '+':
					stack.push(a + b);
					break;
				case '-':
					stack.push(a - b);
					break;
				case '*':
					stack.push(a * b);
					break;
				case '/':
					stack.push(a / b);
					break;
				}
			}
		}
		return stack.pop();
	}

	public static void main(String[] args) {
		String expr = "231*+9-"; // (2 + (3 * 1)) - 9 = -4
		System.out.println("Postfix Evaluation: " + evaluate(expr));
	}
}
