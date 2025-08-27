package com.stack;

import java.util.*;

class MyQueue {
	Stack<Integer> in = new Stack<>();
	Stack<Integer> out = new Stack<>();

	public void enqueue(int x) {
		in.push(x);
	}

	public int dequeue() {
		if (out.isEmpty())
			while (!in.isEmpty())
				out.push(in.pop());
		return out.pop();
	}

	public int peek() {
		if (out.isEmpty())
			while (!in.isEmpty())
				out.push(in.pop());
		return out.peek();
	}

	public boolean isEmpty() {
		return in.isEmpty() && out.isEmpty();
	}
}

public class Queue {
	public static void main(String[] args) {
		MyQueue q = new MyQueue();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		System.out.println(q.dequeue()); // 1
		System.out.println(q.peek()); // 2
	}
}
