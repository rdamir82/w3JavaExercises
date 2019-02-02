package collection;

import java.util.ArrayList;

public class Task15 {

	public static void main(String[] args) {
		
		// Write a Java program to join two array lists
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("Pencil");
		list.add("Sheet");
		
		System.out.println("List = " + list);
		
		ArrayList<String> list2 = new ArrayList<>();
		
		list2.add("Table");
		list2.add("Something");
		
		System.out.println("List2 = " + list2);
		
		list2.addAll(list);
		
		System.out.println("List2 after adding list -> List2 = " + list2);
			

	}

}
