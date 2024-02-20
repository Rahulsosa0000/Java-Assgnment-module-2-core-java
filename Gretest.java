package assignmentR;

import java.util.Scanner;

public class Gretest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=0;
		int num2=0;
		int num3=0;
		
		Scanner sc =new Scanner (System.in);
		System.out.println("enter first number:");
		num1=sc.nextInt();
		System.out.println("enter second number:");
		num2=sc.nextInt();
		System.out.println("enter third number:");
		num3=sc.nextInt();
		
		if(num1>num2 && num1>num3) {
			System.out.println("first number is gretest:"+num1);
		
		}
		else if(num2>num3) {
			System.out.println("second number is gretest:"+num2);
		}
		else {
			System.out.println("third number is gretest:"+num3);
			sc.close();
		}


	}

}
