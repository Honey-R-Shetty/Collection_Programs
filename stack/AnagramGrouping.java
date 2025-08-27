package com.map;

import java.util.*;

public class AnagramGrouping {
    public static void main(String[] args) {
        String[] arr = {"bat", "tab", "eat", "tea", "tan", "nat"};
        Map<String,List<String>> map = new HashMap<String, List<String>>();
        
        for(String word : arr) {
        	char[] chars = word.toCharArray();
        	Arrays.sort(chars);
        	String key = new String(chars);
        	if(!map.containsKey(key)) {
        		map.put(word, null);
        	}
        }
    }
}

