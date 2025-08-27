package com.policymanagement;

import java.util.*;

class PolicyManager {
	private Map<Integer, Policy> map;

	public PolicyManager(Map<Integer, Policy> map) {
		this.map = map;
	}

	public void addPolicy(Policy p) {
		map.put(p.getId(), p);
	}

	public void removePolicy(int id) {
		map.remove(id);
	}

	public Policy getPolicy(int id) {
		return map.get(id);
	}

	public void showAll() {
		if (map.isEmpty()) {
			System.out.println("No policies available.");
			return;
		}
		for (Policy p : map.values()) {
			System.out.println(p);
		}
	}
}
