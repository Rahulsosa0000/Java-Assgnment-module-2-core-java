package assignmentR;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=0;
	     int  average=0;
		int sum=0;
		int i=0;
		
		System.out.println("Enter five number");
		Scanner sc=new Scanner (System.in);
		
		for(i=1;i<=5;i++) {
			
			n=sc.nextInt();
			sum=sum+n;
		}
		System.out.println("Sum of number:"+sum);
		average=sum/5;
		System.out.println("Average:"+average);
		sc.close();
		

	}

}
