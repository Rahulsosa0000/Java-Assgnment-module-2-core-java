//• Write a Java program to get the number of elements in a hash set. 


package assignmentR;

import java.util.HashSet;

public class Hashsetsize {

	public static void main(String[] args) {
		
		HashSet<Integer> num=new HashSet<>();
		
		num.add(5);
		num.add(1);
		num.add(8);
		num.add(9);
		num.add(55);
		
		int getsize=num.size();
		
		System.out.println("Number of element is:-"+getsize);
		
		

	}

}
