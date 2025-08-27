package com.linkedlist;

import java.util.*;

public class ReverseInGroups {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        int k = 3;
        for (int i = 0; i < list.size(); i += k) {
            int end = Math.min(i+k, list.size());
            Collections.reverse(list.subList(i, end));
        }
        System.out.println("Reversed in groups: " + list);
    }
}

