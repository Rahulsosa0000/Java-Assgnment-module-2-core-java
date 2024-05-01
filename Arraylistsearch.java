//Q.• Write a Java program to search an element in an array list. 
 

package assignmentR;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylistsearch {

	public static void main(String[] args) {
		
ArrayList<Integer> num=new ArrayList<>();
		
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		num.add(50);
		
		System.out.println("Elements"+num);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Search Element of Number:");
		int searchnum=sc.nextInt();
		
		if(num.contains(searchnum)) {
			System.out.println("Element found Position at:-"+num.indexOf(searchnum));
		}else {
			System.out.println("Element not found!!!");
		}
		

	}

}
