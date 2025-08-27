package com.set;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class FirstNonDuplicateElement {
	public static void main(String[] args) {
		 List<Integer> list = Arrays.asList(4, 5, 6, 4, 7, 8, 5);
		 LinkedHashSet<Integer> set = new LinkedHashSet<>();
		 for(Integer number : list) {
			 if(!set.add(number))
				 set.remove(number);
		 }
		 System.out.println(set.getFirst());
	}
}
