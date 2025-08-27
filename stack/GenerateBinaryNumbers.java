package com.queue;

import java.util.*;

public class GenerateBinaryNumbers {
    public static List<String> generateBinary(int n) {
        List<String> result = new ArrayList<>();
        Queue<String> q = new LinkedList<>();
        q.offer("1");

        for (int i = 0; i < n; i++) {
            String curr = q.poll();
            result.add(curr);
            q.offer(curr + "0");
            q.offer(curr + "1");
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(generateBinary(5));
        // [1, 10, 11, 100, 101]
    }
}

