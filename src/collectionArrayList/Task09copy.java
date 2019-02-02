package collectionArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Task09copy {

	public static void main(String[] args) {
		
		// Write a Java program to copy one array list into another
	
		ArrayList<String> list = new ArrayList<>();
		
		list.add("Pencil");
		list.add("Sheet");
		
		System.out.println("List = " + list);
		
		ArrayList<String> list2 = new ArrayList<>();
		
		list2.add("Table");
		list2.add("Something");
		
		System.out.println("List2 = " + list2);
		
		// this is adding, NOT COPY! 
		
		//list2.addAll(list);
		
		//System.out.println("List2 after adding list -> List2 = " + list2);
		
		// Solution:
		
		Collections.copy(list, list2);
		
		System.out.println("List = " + list);
		
		System.out.println("List2 = " + list2);
		
	
	
	
	}

}
