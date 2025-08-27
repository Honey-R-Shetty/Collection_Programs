package com.map;

import java.util.*;

public class DuplicatesInArray {
	public static void main(String[] args) {
        int[] arr = {1,2,3,2,4,5,1,2};
        Map<Integer, Integer> map = new HashMap<>();

        for (int n : arr) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        map.entrySet().stream()
           .filter(e -> e.getValue() > 1)
           .forEach(System.out::println);
    }
}
