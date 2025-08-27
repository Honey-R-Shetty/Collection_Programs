package com.queue;

import java.util.*;

public class LRUCache<K, V> {
	private final int capacity;
	private final Map<K, V> map;
	private final Deque<K> deque;

	public LRUCache(int capacity) {
		this.capacity = capacity;
		this.map = new HashMap<>();
		this.deque = new ArrayDeque<>();
	}

	public V get(K key) {
		if (!map.containsKey(key))
			return null;

		// Move key to front (most recent)
		deque.remove(key);
		deque.addFirst(key);

		return map.get(key);
	}

	public void put(K key, V value) {
		if (map.containsKey(key)) {
			deque.remove(key);
		} else if (map.size() == capacity) {
			// Remove least recently used
			K lru = deque.removeLast();
			map.remove(lru);
		}
		deque.addFirst(key);
		map.put(key, value);
	}

	public void display() {
		System.out.println("Cache: " + deque);
	}

	public static void main(String[] args) {
		LRUCache<Integer, String> cache = new LRUCache<>(2);
		cache.put(1, "A");
		cache.put(2, "B");
		cache.display(); // [2, 1]

		cache.get(1);
		cache.display(); // [1, 2]

		cache.put(3, "C"); // removes key 2
		cache.display(); // [3, 1]
	}
}
