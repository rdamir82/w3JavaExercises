package collection;

import java.util.ArrayList;
import java.util.Collections;

public class Task10 {

	public static void main(String[] args) {
		
		// Write a Java program to shuffle elements in a array list.
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");
		list.add("G");
		
		System.out.println(list);
		
		Collections.shuffle(list);
		
		System.out.println(list);
		
		
		

	}

}
