//Q.Write a Java program to iterate through all elements in a hash list.
package assignmentR;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset2iterate {

	public static void main(String[] args) {

		HashSet<String> fruits=new HashSet<>();
		
		fruits.add("Orange");
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Grapes");
		fruits.add("Watermelon");
		
		System.out.println("Before iterate:-"+fruits);
		
		System.out.println();

		
		System.out.println("After iterate");

		Iterator<String> iterator=fruits.iterator();
		
		while(iterator.hasNext()) {
			
			String f=iterator.next();
			
			System.out.println(f);
		}




	}

}
