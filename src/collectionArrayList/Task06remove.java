package collectionArrayList;

import java.util.ArrayList;

public class Task06remove {

	public static void main(String[] args) {
		
		// Write a Java program to remove the third element from a array list
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Apple");
		list.add("Orange");
		list.add("Grape");
		list.add("Strawberry");
		
		System.out.println(list);
		
		// remove the third element ("Grape")
		
		// define the index of third element
		int index = 2;
		
		// remove from ArrayList
		list.remove(index);
		
		// print the modified ArrayList
		System.out.println(list);

	}

}
