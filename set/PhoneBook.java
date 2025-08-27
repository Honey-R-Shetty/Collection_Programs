package com.map;

import java.util.*;

public class PhoneBook {
    public static void main(String[] args) {
        TreeMap<String, String> phoneBook = new TreeMap<>();
        phoneBook.put("Alice", "12345");
        phoneBook.put("Bob", "67890");

        System.out.println("Bob's number: " + phoneBook.get("Bob"));
        phoneBook.remove("Alice");
        System.out.println(phoneBook);
    }
}

