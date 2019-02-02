package collectionArrayList;

import java.util.ArrayList;
//import java.util.Collection;

public class Task13comparison {

	public static void main(String[] args) {
		
		// Write a Java program to compare two array lists
		
		ArrayList<String> list1 = new ArrayList<>();
		
		list1.add("Adel");
		list1.add("Leda");
		list1.add("Virag");
		
		System.out.println("List1: " + list1);
		
		ArrayList<String> list2 = new ArrayList<>();
		
		list2.add("Adel");
		list2.add("Leda");
		list2.add("Ledus");
		
		System.out.println("List2: " + list2);
		
		
		// my solution
		System.out.println("Two list are same: " +  list1.equals(list2));
		
		// solution w3
		
		ArrayList<String> comparison = new ArrayList<>();
		for (String e : list1)
			comparison.add(list2.contains(e) ? "Yes" : "No");
		System.out.println(comparison);
		
	}

}
