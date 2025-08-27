package com.set;

import java.util.List;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class ClassSpecificSetBehaviour {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5, 3, 5, 1, 2);
		System.out.println("Hashset : "+ new HashSet<Integer>(list));
		System.out.println("Linkedhashset : "+ new LinkedHashSet<Integer>(list));
		System.out.println("Treeset : "+ new TreeSet<Integer>(list));
	}
}
