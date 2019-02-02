package collection;

import java.util.ArrayList;

public class Task05 {

	public static void main(String[] args) {
		
		// Write a Java program to update 
		// specific array element by given element.

		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Red");
		list.add("Orange");
		list.add("Yellow");
		list.add("Blue");
		list.add("Purple");
		
		// print list
		
		System.out.println(list);
		
		// update array element by given element
		
		list.set(2, "Black");
		
		// print uupdated list
		
		System.out.println(list);
		
	}

}
