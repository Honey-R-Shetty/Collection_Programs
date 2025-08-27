package com.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoLists {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> list2 = Arrays.asList(7, 9, 3, 4, 9, 2, 6);

		List<Integer> intersection = new ArrayList<Integer>(list1);
		intersection.retainAll(list2);
		System.out.println(intersection);
	}
}
