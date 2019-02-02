package collectionArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Task14swap {

	public static void main(String[] args) {
		
		// Write a Java program of swap two elements in an array list
		
		ArrayList<String> list1 = new ArrayList<>();
		
		list1.add("item1");
		list1.add("item2");
		list1.add("item3");
		
		System.out.println(list1);
		ArrayList<String> list2 = new ArrayList<>();
		
		list2.add("A");
		list2.add("B");
		list2.add("C");
		list2.add("D");
		System.out.println(list2);
		// swap to elements in an array list
		swapItemsInside(list1, 2, 0);
		swapItemsInside(list2, 1, 3);
		
		System.out.println(list1);
		System.out.println(list2);
		
		// swap to elements between two different arrayList
		swapItemsArrToArr(list1, 0, list2, 3);
		
		System.out.println(list1);
		System.out.println(list2);
		
		// swap with collections method swap :)
		
		Collections.swap(list1, 0, 2);
		Collections.swap(list2, 0, 3);
		
		System.out.println(list1);
		System.out.println(list2);
		
		

	}
	
	static void swapItemsArrToArr(ArrayList<String> fromArray, int firstIndex, ArrayList<String> toArray, int secondIndex) {
		String temp = fromArray.get(firstIndex);
		fromArray.set(firstIndex, toArray.get(secondIndex));
		toArray.set(secondIndex, temp);
	}
	
	static void swapItemsInside(ArrayList<String> Array, int firstIndex, int secondIndex) {
		String temp = Array.get(firstIndex);
		Array.set(firstIndex, Array.get(secondIndex));
		Array.set(secondIndex, temp);
	}
	

}
