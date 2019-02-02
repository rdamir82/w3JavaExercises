package collection;

import java.util.ArrayList;

public class Task03 {

	public static void main(String[] args) {

		/*
		 Write a Java program to insert an element 
		 into the array list at the first position 
		 */
		
		// Initializing Array list:
		ArrayList<String> list = new ArrayList<String>();
				
		list.add("Red");
		list.add("Orange");
		list.add("Yellow");
		list.add("Blue");
		list.add("Green");
		list.add("Purple");
		list.add("Pink");
		
		// insert an element ("White") into the array list at the first position
		
		list.add(0, "White");
		
		// print ArrayList:
		
		System.out.println(list);
		
		
		

	}

}
