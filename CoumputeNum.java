package assignmentR;

import java.util.Scanner;

public class CoumputeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter the Number:-");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(+n); 
		int a=n*10+n;
		int b=n*100+a;
		System.out.println(+a);
		System.out.println(+b);
		
		int result=n+a+b;
		System.out.println(+result);
		

	}

}
