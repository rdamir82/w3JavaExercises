package collection;

import java.util.ArrayList;
import java.util.Collections;

public class Task11 {

	public static void main(String[] args) {
		
		// Write a Java program to reverse elements in a array list
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("Adel");
		list.add("Leda");
		list.add("Virag");
		list.add("Nati");
		list.add("Nora");
		
		System.out.println(list);
		
		Collections.reverse(list);
		
		System.out.println(list);
		
	}

}
