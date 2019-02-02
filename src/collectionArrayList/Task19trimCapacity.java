package collectionArrayList;

import java.util.ArrayList;

public class Task19trimCapacity {

	public static void main(String[] args) {
		
		// Write a Java program to trim the capacity of an array list the current list size
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Red");
		list.add("Orange");
		list.add("Yellow");
		list.add("Blue");
		list.add("Green");
		list.add("Purple");
		list.add("Pink");
		
		System.out.println("The ArrayList size is: " + list.size());
		System.out.println("Trimming..");
		list.trimToSize();
		System.out.println("The ArrayList size is: " + list.size());

	}

}
