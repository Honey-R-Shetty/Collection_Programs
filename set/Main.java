package com.policymanagement;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Choose Map Implementation: \n1.HashMap \n2.TreeMap \n3.LinkedHashMap");
		int choice = sc.nextInt();

		Map<Integer, Policy> selectedMap;
		if (choice == 2) {
			selectedMap = new TreeMap<>();
		} else if (choice == 3) {
			selectedMap = new LinkedHashMap<>();
		} else {
			selectedMap = new HashMap<>();
		}

		PolicyManager manager = new PolicyManager(selectedMap);

		while (true) {
			System.out.println("\n1.Add 2.Remove 3.Get 4.ShowAll 5.Exit");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.print("Enter id: ");
				int id = sc.nextInt();
				System.out.print("Enter type: ");
				String type = sc.next();
				System.out.print("Enter premium: ");
				double premium = sc.nextDouble();
				System.out.print("Enter expiry: ");
				String expiry = sc.next();
				manager.addPolicy(new Policy(id, type, premium, expiry));
				break;
			case 2:
				System.out.print("Enter id: ");
				int rid = sc.nextInt();
				manager.removePolicy(rid);
				break;
			case 3:
				System.out.print("Enter id: ");
				int gid = sc.nextInt();
				System.out.println(manager.getPolicy(gid));
				break;
			case 4:
				manager.showAll();
				break;
			case 5:
				System.out.println("Exiting...");
				sc.close();
				return;
			default:
				System.out.println("Invalid option!");
			}
		}
	}
}
