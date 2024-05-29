//• Write a Java program to compare two array lists.  

package collection;

import java.util.ArrayList;

public class CompareArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> name = new ArrayList<>();

		name.add("Rahul");
		name.add("Meet");

		ArrayList<String> name2 = new ArrayList<>();

		name2.add("Rahul");
		name2.add("Meet");
		  
	       
	        if(name.equals(name2)) {
	            System.out.println("The ArrayLists are equal.");
	        } else {
	            System.out.println("The ArrayLists are not equal.");
	        }
		

	}

}
