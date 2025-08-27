package com.linkedlist;

import java.util.*;

public class CloneList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(10,20,30));
        LinkedList<Integer> clone = new LinkedList<>(list);
        System.out.println("Original: " + list);
        System.out.println("Clone   : " + clone);
    }
}
