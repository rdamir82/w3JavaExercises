package collection;

import java.util.ArrayList;

public class Task07 {

	public static void main(String[] args) {
		
		// Write a Java program to search an element in a array list
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("item1");
		list.add("item2");
		list.add("item3");
		list.add("item4");
		
		System.out.println(list);
		
		// search term for item4:
		
		String searchFor = "item4";
		
		
		// my solution:
		int i = 0;
		Boolean found = false;
		for(String item : list) {
			if(searchFor.equals(item)) {
				System.out.println("Your seach term ( " + searchFor + " ) was founded at position: " + i);
				found = true;
			}
			i++;
			if((i == list.size()) & found == false) {
				System.out.println("For Your seach term ( " + searchFor + " ) nothing was found");
			}
						
		}
		
		// solution using contains() function:
		
		if (list.contains(searchFor)) {
			System.out.println("Found the element");
		} else {
			System.out.println("There is no such element");
		}
		

	}

}
