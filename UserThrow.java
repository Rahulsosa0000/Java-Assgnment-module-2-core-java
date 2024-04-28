//Q.W.A.J.P to create the validate method that takes integer value as a parameter. If the 
//age is less than 18, then throw an Arithmetic Exception otherwise print a message 
//welcome to vote. 

package assignmentR;

import java.util.Scanner;

public class UserThrow {
   public static void vote(int age) throws Exception {
	   if (age<18) {
			throw new ArithmeticException();
		}
		else {
		   System.out.print("Welcome to vote");	
		}
   }
	
	public static void main (String []args) throws Exception {
		
		System.out.println("Enter age:-");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		
		vote(age);
		
		
	}
}
