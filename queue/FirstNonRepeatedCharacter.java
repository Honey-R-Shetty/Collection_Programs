package com.map;

import java.util.*;

public class FirstNonRepeatedCharacter {
	public static void main(String[] args) {
		String s = "swiss";
		Map<Character, Integer> map = new LinkedHashMap<>();

		for (char c : s.toCharArray())
			map.put(c, map.getOrDefault(c, 0) + 1);

		for (var e : map.entrySet()) {
			if (e.getValue() == 1) {
				System.out.println(e.getKey());
				break;
			}
		}
	}
}
