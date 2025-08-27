package com.set;

import java.util.*;

class IntersectionExample {
	public static void main(String[] args) {
		List<Set<Integer>> sets = Arrays.asList(new HashSet<>(Arrays.asList(1, 2, 3)),
				new HashSet<>(Arrays.asList(2, 3, 4)), new HashSet<>(Arrays.asList(3, 4, 5)));

		Set<Integer> result = new HashSet<>(sets.get(0));
		for (Set<Integer> s : sets) {
			result.retainAll(s);
		}

		System.out.println(result);
	}
}
