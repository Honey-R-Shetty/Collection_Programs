package com.stack;

import java.util.*;

public class InfixToPostfix {
	public static int precedence(char c) {
		if (c == '+' || c == '-')
			return 1;
		if (c == '*' || c == '/')
			return 2;
		if (c == '^')
			return 3;
		return -1;
	}

	public static String convert(String expression) {
		StringBuilder result = new StringBuilder();
		Stack<Character> stack = new Stack<>();

		for (char c : expression.toCharArray()) {
			if (Character.isLetterOrDigit(c)) {
				result.append(c);
			} else if (c == '(') {
				stack.push(c);
			} else if (c == ')') {
				while (!stack.isEmpty() && stack.peek() != '(') {
					result.append(stack.pop());
				}
				stack.pop();
			} else {
				while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
					result.append(stack.pop());
				}
				stack.push(c);
			}
		}
		while (!stack.isEmpty()) {
			result.append(stack.pop());
		}
		return result.toString();
	}

	public static void main(String[] args) {
		String expr = "A*(B+C)/D";
		System.out.println("Infix: " + expr);
		System.out.println("Postfix: " + convert(expr));
	}
}
