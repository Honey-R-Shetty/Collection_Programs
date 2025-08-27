package com.linkedlist;

import java.util.*;

public class MergeLists {
	 public static void main(String[] args) {
	        LinkedList<Integer> l1 = new LinkedList<>(Arrays.asList(1,3,5));
	        LinkedList<Integer> l2 = new LinkedList<>(Arrays.asList(2,4,6));
	        l1.addAll(l2);
	        Collections.sort(l1);
	        System.out.println("Merged List: " + l1);
	    }
}
