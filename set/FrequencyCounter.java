package com.map;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {
	public static void main(String[] args) {
		String word = "Programming";
		Map<Character,Integer> map = new HashMap<Character, Integer>();
		for(Character ch : word.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		System.out.println(map);
	}
}
