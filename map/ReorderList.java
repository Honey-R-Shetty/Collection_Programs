package com.linkedlist;

import java.util.*;

public class ReorderList {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
		LinkedList<Integer> res = new LinkedList<>();
		while (!list.isEmpty()) {
			if (!list.isEmpty())
				res.add(list.removeFirst());
			if (!list.isEmpty())
				res.add(list.removeLast());
		}
		System.out.println("Reordered: " + res);
	}
}
