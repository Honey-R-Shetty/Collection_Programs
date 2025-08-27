package com.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class UnionList {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> list2 = Arrays.asList(7, 9, 3, 4, 9, 2, 6);
		
		LinkedHashSet<Integer> list3 = new LinkedHashSet<Integer>();
		list3.addAll(list1);
		list3.addAll(list2);
		
		ArrayList<Integer> union = new ArrayList<>(list3);
		System.out.println(union);
	}
}
