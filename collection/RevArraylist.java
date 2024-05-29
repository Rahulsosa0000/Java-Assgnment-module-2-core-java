//• Write a Java program to reverse elements in an array list.   

package collection;

import java.util.ArrayList;
import java.util.Collections;


public class RevArraylist {

	public static void main(String[] args) {
		
		ArrayList<Integer> num=new ArrayList<>();
		
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		
		System.out.println("Orignal form:-"+num);
		
		Collections.reverse(num);
		
		System.out.println("Reversed form:-"+num);
	}

}
