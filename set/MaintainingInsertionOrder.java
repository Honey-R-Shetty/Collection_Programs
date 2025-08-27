package com.set;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class MaintainingInsertionOrder {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("apple", "banana", "apple", "orange");
		System.out.println(new LinkedHashSet<String>(list));
	}
}
