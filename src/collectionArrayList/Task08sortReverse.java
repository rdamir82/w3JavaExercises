package collectionArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Task08sortReverse {

	public static void main(String[] args) {
		
		// Write a Java program to sort a given array list.
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("Hello");
		list.add("There");
		list.add("How");
		list.add("Are");
		list.add("You");
		list.add("?");
		
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
		
		Collections.reverse(list);
		
		System.out.println(list);
	}

}
