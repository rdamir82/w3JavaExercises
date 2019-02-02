package collectionArrayList;

import java.util.ArrayList;

public class Task21replaceTheSecondE {

	public static void main(String[] args) {
		
		// Write a Java program to replace 
		// the second element of a ArrayList with the specified element
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Red");
		list.add("Orange");
		list.add("Yellow");
		list.add("Blue");
		list.add("Green");
		list.add("Purple");
		list.add("Pink");
		
		System.out.println(list);
		
		replaceItemsInside(list, 1, "White");
		
		System.out.println(list);
		
		String new_color = "White";
		list.set(1,new_color);
		
		int num = list.size();
		System.out.println("Replace second element with 'White'.");
		for(int i=0;i<num;i++) {
		 System.out.println(list.get(i));
	     }
		
	}
	
	static void replaceItemsInside(ArrayList<String> Array, int firstIndex, String text) {
		System.out.println("This item ("+  Array.get(firstIndex) +") will be replaced by this ("+ text +")");
		Array.set(firstIndex, text);
	
	}

}
