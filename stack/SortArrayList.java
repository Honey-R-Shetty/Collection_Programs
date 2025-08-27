package com.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortArrayList {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(7, 8, 9, 1, 2, 3, 4, 5, 6));
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = 0; j < list.size() - 1 - i; j++) {
				if(list.get(j)>list.get(j+1)) {
					int temp = list.get(j);
					list.set(j, list.get(j+1));
					list.set(j+1, temp);
				}
			}
		}
		System.out.println(list);
	}
}
