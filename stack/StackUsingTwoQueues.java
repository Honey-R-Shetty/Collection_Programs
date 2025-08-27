package com.queue;

import java.util.ArrayDeque;

public class StackUsingTwoQueues<T> {
    private final ArrayDeque<T> q1 = new ArrayDeque<>();
    private final ArrayDeque<T> q2 = new ArrayDeque<>();

    // Push operation (costly)
    public void push(T x) {
        q2.offer(x);                  // Add new element to q2
        while (!q1.isEmpty()) {
            q2.offer(q1.poll());      // Move all elements from q1 to q2
        }
        // Swap q1 and q2
        ArrayDeque<T> temp = new ArrayDeque<>(q1);
        q1.clear();
        q1.addAll(q2);
        q2.clear();
    }

    // Pop operation
    public T pop() {
        if (q1.isEmpty()) throw new RuntimeException("Stack is empty");
        return q1.poll();
    }

    // Top element
    public T top() {
        if (q1.isEmpty()) throw new RuntimeException("Stack is empty");
        return q1.peek();
    }

    // Size of stack
    public int size() {
        return q1.size();
    }

    // Check empty
    public boolean isEmpty() {
        return q1.isEmpty();
    }

    // Testing
    public static void main(String[] args) {
        StackUsingTwoQueues<Integer> stack = new StackUsingTwoQueues<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.pop()); // 30
        System.out.println(stack.top()); // 20
        System.out.println(stack.size()); // 2
        System.out.println(stack.isEmpty()); // false
    }
}

