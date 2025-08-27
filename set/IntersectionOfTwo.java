package com.linkedlist;

import java.util.LinkedList;

public class IntersectionOfTwo {
	public static void main(String[] args) {
		LinkedList<Integer> l1 = new LinkedList<>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		LinkedList<Integer> l2 = new LinkedList<>();
		l2.add(30);
		l2.add(40);
		l2.add(50);
		l1.retainAll(l2);
		System.out.println(l1);
	}
}
