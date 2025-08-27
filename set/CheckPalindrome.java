package com.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckPalindrome{
	public static void main(String[] args) {
		List<Character> list = new ArrayList<>(Arrays.asList('m','t','d','a','m'));
		int i=0 ,j=list.size()-1;
		while(i<j) {
			if(!list.get(i).equals(list.get(j))) {
				System.out.println("Not a palindrome");
				return;
			}
		i++;
		j--;
		}
		System.out.println("It is Palindrome");
	}
}


