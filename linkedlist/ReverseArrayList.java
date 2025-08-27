package com.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
		System.out.println(array.reversed());
	}
}
