package assignmentR;

import java.util.Scanner;

public class Numofdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		int count=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number:");
		n=sc.nextInt();
		
		while(n>0) {
			int rem=n%10;
			n=n/10;
			count++;
		}
		System.out.println("Number of digit is:"+count);
		sc.close();
		

	}

}
