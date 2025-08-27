package com.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateElements {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,2,4,1,5,3);
		Set<Integer> set = new HashSet<>();
		ArrayList<Integer> duplicates = new ArrayList<Integer>();
		for(Integer number : list) {
			if(!set.add(number)) {
				duplicates.add(number);
			}
		}
		System.out.println(duplicates);
	}
}
