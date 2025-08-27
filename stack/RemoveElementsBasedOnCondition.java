package com.set;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class RemoveElementsBasedOnCondition {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		TreeSet<Integer> set = new TreeSet<>();
		for(Integer number : list) {
			if(number>=3)
				set.add(number);
		}
		System.out.println(set);
	}
}
