package collectionArrayList;

import java.util.ArrayList;
import java.util.List;

public class Task12subList {

	public static void main(String[] args) {
		
		// Write a Java program to extract a portion of a array list
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Adel");
		list.add("Damir");
		list.add("Virag");
		list.add("Nora");
		list.add("Leda");
		
		System.out.println(list);
		
		List<String> sub_String = list.subList(0, 3);
		
		System.out.println(sub_String);
	}

}
