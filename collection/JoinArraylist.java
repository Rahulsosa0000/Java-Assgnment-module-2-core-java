//• Write a Java program to join two array lists.  

package collection;

import java.util.ArrayList;
import java.util.List;

public class JoinArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> fruit = new ArrayList<>();

		fruit.add("Orange");
		fruit.add("banana");
		
		ArrayList<String> fruit2 = new ArrayList<>();

		fruit2.add("graps");
		fruit2.add("mango");
		
		List<String> join = new ArrayList<>(fruit);
		
		join.addAll(fruit2);
		
		System.out.println("Join two arraylist:-"+join);


	}

}
