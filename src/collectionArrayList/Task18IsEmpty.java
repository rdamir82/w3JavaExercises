package collectionArrayList;

import java.util.ArrayList;

public class Task18IsEmpty {

	public static void main(String[] args) {
		
		//Write a Java program to test an array list is empty or not
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Red");
		list.add("Orange");
		list.add("Yellow");
		list.add("Blue");
		list.add("Green");
		list.add("Purple");
		list.add("Pink");
		
		ArrayList<Integer> intList = new ArrayList<>();
		
		System.out.println("The list array is empty: " + list.isEmpty());
		System.out.println("The intList array is empty: " + intList.isEmpty());
			
	}

}
