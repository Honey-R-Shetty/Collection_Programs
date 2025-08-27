package com.linkedlist;

import java.util.Arrays;
import java.util.LinkedList;

public class RemoveNthNodeFromEnd {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>(Arrays.asList(10, 20, 30, 40, 50));
		int n = 2;
		int index = list.size() - n;
		list.remove(index);
		System.out.println("After removing: " + list);
	}
}
