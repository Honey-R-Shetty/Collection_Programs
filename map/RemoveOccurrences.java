package com.linkedlist;

import java.util.*;

public class RemoveOccurrences {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,2,3,2,4,2,5));
        list.removeIf(x -> x == 2);
        System.out.println(list); // [1, 3, 4, 5]
    }
}
