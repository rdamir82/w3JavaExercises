package collectionArrayList;

import java.util.ArrayList;

public class Task20increaseTheArraySize {

	public static void main(String[] args) {
		
		// Write a Java program to increase the size of an array list
		
		ArrayList<String> list = new ArrayList<String>(3);
		
		list.add("Red");
		list.add("Orange");
		list.add("Yellow");
		System.out.println(list);
		// incrase capacity to 7
		list.ensureCapacity(7);
		list.add("Blue");
		list.add("Green");
		list.add("Purple");
		list.add("Pink");
		System.out.println(list);

	}

}
