package assignmentR;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a program to print the factorial of a number by defining a method named 
//		'Factorial'. Factorial of any number n is represented by n! And is equal to 1*2*3*.
		
		
		int num=0;
		System.out.println("Enter the number :");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		int fact=1;
		int i=0;
		
		for( i=1;i<=num;i++){
		
		fact=fact*i;
	
		}
		System.out.println(fact);
	
		

	}

}
