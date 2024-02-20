package assignmentR;

import java.util.Scanner;

public class CheckLeap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year:");
		year=sc.nextInt();
		
		if(year%4==0||year%400==0) {
			System.out.println("year is leap");
		}
		else {
			System.out.println("year is not leap");
			sc.close();
		}

	}

}
