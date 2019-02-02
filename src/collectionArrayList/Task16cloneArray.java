package collectionArrayList;

import java.util.ArrayList;

public class Task16cloneArray {

	public static void main(String[] args) {
		
		// 16. Write a Java program to clone an array list to another array list

		ArrayList<String> list = new ArrayList<String>();
			
		list.add("Red");
		list.add("Orange");
		list.add("Yellow");
		list.add("Blue");
		list.add("Green");
		list.add("Purple");
		list.add("Pink");
		
		System.out.println(list);
		
		ArrayList<String> clonedList = (ArrayList<String>)list.clone();
		
		System.out.println(clonedList);
		
		
	}

}
