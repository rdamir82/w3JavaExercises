package collection;

import java.util.ArrayList;

public class Task04 {

	public static void main(String[] args) {
		
		/*
		 * Write a Java program to retrieve an element 
		 * (at a specified index) from a given array list
		 */
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("element at 0");
		list.add("element at 1");
		list.add("element at 2");
		list.add("element at 3");
		list.add("element at 4");
		
		// Print the list
		  
		System.out.println(list);
		
		// retrieve an element (at a specified index) from array list
		
		int index = 2;
		
		// print element:
		
		System.out.println(list.get(index));

	}

}
