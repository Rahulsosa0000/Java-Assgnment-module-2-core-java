//Q.• Write a Java program to remove the third element from an array list. 

package assignmentR;

import java.util.ArrayList;

public class Arraylistremove {

	public static void main(String[] args) {
		
    ArrayList<Integer> num=new ArrayList<>();
		
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(30);
		num.add(40);
		num.add(50);
		
		System.out.println("Before Remove:-"+num);
		
		num.remove(3);
		
		System.out.println("After Remove:-"+num);

	}

}
