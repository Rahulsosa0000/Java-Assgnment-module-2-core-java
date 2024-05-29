//• Write a Java program to convert a hash set to an array.  

package collection;

import java.util.HashSet;

public class ConverHashSet {

	public static void main(String[] args) {
		
		  HashSet<String> fruit = new HashSet<>();

	   
		  fruit.add("Apple");
	        fruit.add("Banana");
	        fruit.add("Orange");


	        String[] array = new String[fruit.size()];
	        fruit.toArray(array);

	     
	        System.out.println("Array elements:");
	        for (String i : array) {
	            System.out.println(i);
	}
	}
}
