//• Write a Java program of swap two elements in an array list.   



package collection;

import java.util.ArrayList;
import java.util.Collections;

public class SwapArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> fruit=new ArrayList<>();
		
		fruit.add("Orange");
		fruit.add("banana");
		
		
		System.out.println("Orignal:-"+fruit);
		
		Collections.swap(fruit, 0,1); 
		
		System.out.println("swap:-"+fruit);


	}

}
