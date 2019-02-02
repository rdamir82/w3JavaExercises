package collectionArrayList;

import java.util.ArrayList;

public class Task01createAdd {

	public static void main(String[] args) {
		
		/*
		 * Write a Java program to create a new array list, 
		 * add some colors (string) and print out the collection. 
		 */
		
		ArrayList<String> list = new ArrayList<String>();
		
		// adding colors Strings to Array list
		
		list.add("Red");
		list.add("Orange");
		list.add("Yellow");
		list.add("Blue");
		list.add("Green");
		list.add("Purple");
		list.add("Pink");
		
		// iterating items from the Array list: (02)
		
		for(String colors : list) {
			System.out.println(colors);
		}
		
		// printing the Array list: (01) 
		System.out.println(list);
				
	}

}
