package com.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FirstNonRepeatingNumber {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(7, 8, 9, 1, 2, 7, 3, 4, 5, 6));

		Map<Integer, Integer> freq = new LinkedHashMap<>();

		for (Integer num : list) {
			freq.put(num, freq.getOrDefault(num, 0) + 1);
		}

		for (Integer num : list) {
			if (freq.get(num) == 1) {
				System.out.println("First non repeating number is : " + num);
				return;
			}
		}
		System.out.println("Theres no non repeating number..");
	}
}
