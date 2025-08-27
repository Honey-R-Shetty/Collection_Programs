package com.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinMaxArrayList {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(7, 8, 9, 1, 2, 3, 4, 5, 6));
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(Integer number : list) {
			max = Math.max(max, number);
			min = Math.min(min, number);
		}
		System.out.println("Maximum number is : "+max);
		System.out.println("Minimum number is : "+min);
	}
}
