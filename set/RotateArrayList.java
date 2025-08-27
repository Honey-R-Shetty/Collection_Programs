package com.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateArrayList {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		int k = 2;
		k = k % list.size();

		ArrayList<Integer> rotate = new ArrayList<Integer>();

		for (int i = list.size() - k; i < list.size(); i++) {
			rotate.add(list.get(i));
		}

		for (int i = 0; i < list.size() - k; i++) {
			rotate.add(list.get(i));
		}

		System.out.println("Original list : " + list);
		System.out.println("Rotated list : " + rotate);
	}
}
