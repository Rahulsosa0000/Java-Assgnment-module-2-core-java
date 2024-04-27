//Take two numbers from the user and perform the division operation and handle 
//Arithmetic Exception. O/P- Enter two numbers: 10 0 
//Exception in thread main java.lang.ArithmeticException:/ by zero


package assignmentR;

import java.util.Scanner;

public class Arithtry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter first number:-");
		
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		System.out.println("Enter second number:-");
		int num2=sc.nextInt();
		int num3;
		 
		try {
			num3=num1/num2;
			System.out.println("Division of two number:-"+num3);
		}catch(Exception e) {
			System.out.println("We can not divide by 0."+e);
		}
		

	}

}
