/*Q.Write a Java program to retrieve an element (at a specified index) from a given array 
list. */

package assignmentR;

import java.util.ArrayList;

public class Arraylistposition {

	public static void main(String[] args) {
		
		ArrayList<Integer> number=new ArrayList<>();
		
		number.add(10);
		number.add(20);
		number.add(30);
		number.add(40);
		number.add(50);
		number.add(60);
		
		System.out.println("Numbers"+number);
		
		System.out.println("Retrive Specified Elements:-"+number.get(2));
		

	}

}
