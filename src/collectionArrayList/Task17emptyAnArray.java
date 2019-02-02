package collectionArrayList;

import java.util.ArrayList;

public class Task17emptyAnArray {

	public static void main(String[] args) {
		
		// 17. Write a Java program to empty an array list
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Red");
		list.add("Orange");
		list.add("Yellow");
		list.add("Blue");
		list.add("Green");
		list.add("Purple");
		list.add("Pink");
		
		System.out.println(list);
		
		list.clear();
		
		// we can use:  list.removeAll(list);
		
		System.out.println(list);

	}

}
