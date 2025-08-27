package com.linkedlist;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class PalindromeCheck {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,2,3,2,1));
        LinkedList<Integer> rev = new LinkedList<>(list);
        Collections.reverse(rev);
        if (list.equals(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome"); 
	}
}
