package com.arraylist;

import java.util.*;

public class RemoveDuplicates {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(10);
		list.add(30);
		list.add(20);
		list.add(40);

		// Remove duplicates
		LinkedHashSet<Integer> set = new LinkedHashSet<>(list);
		ArrayList<Integer> uniqueList = new ArrayList<>(set);

		System.out.println("Original List: " + list);
		System.out.println("List without Duplicates: " + uniqueList);
	}
}
