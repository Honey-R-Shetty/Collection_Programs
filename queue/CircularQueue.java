package com.queue;

public class CircularQueue<T> {
    private final Object[] data;
    private int head = 0, tail = 0, size = 0;

    // Constructor
    public CircularQueue(int capacity) {
        data = new Object[capacity];
    }

    // Insert element at the rear
    public boolean offer(T x) {
        if (size == data.length) return false; // Queue is full
        data[tail] = x;
        tail = (tail + 1) % data.length; // wrap around
        size++;
        return true;
    }

    // Remove element from the front
    @SuppressWarnings("unchecked")
    public T poll() {
        if (size == 0) return null; // Queue is empty
        T value = (T) data[head];
        data[head] = null; // Optional (clear reference)
        head = (head + 1) % data.length;
        size--;
        return value;
    }

    // Peek front element
    @SuppressWarnings("unchecked")
    public T peek() {
        return (size == 0) ? null : (T) data[head];
    }

    // Queue size
    public int size() {
        return size;
    }

    // Check if empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Check if full
    public boolean isFull() {
        return size == data.length;
    }

    // Capacity
    public int capacity() {
        return data.length;
    }

    // Testing
    public static void main(String[] args) {
        CircularQueue<Integer> cq = new CircularQueue<>(3);

        cq.offer(10);
        cq.offer(20);
        cq.offer(30);

        System.out.println(cq.peek()); // 10
        System.out.println(cq.poll()); // 10
        cq.offer(40);

        while (!cq.isEmpty()) {
            System.out.println(cq.poll()); // 20, 30, 40
        }
    }
}

