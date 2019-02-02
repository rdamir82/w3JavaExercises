package collectionArrayList;

import java.util.ArrayList;

public class Task22prinaAllElements {

	public static void main(String[] args) {
		
		// Write a Java program to print all the elements of a ArrayList using the position of the elements
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Red");
		list.add("Orange");
		list.add("Yellow");
		list.add("Blue");
		list.add("Green");
		list.add("Purple");
		list.add("Pink");
		
		System.out.println(list);
		
		System.out.println("--------------------------");
		
		for(int i=0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("--------------------------");
		
		for(String element : list) {
			System.out.println(element);
		}

	}

}
