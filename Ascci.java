package assignmentR;

import java.util.Scanner;

public class Ascci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch='0';
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter char");
		ch=sc.next().charAt(0);
		
		System.out.println(+(char)+ch);
		sc.close();


	}

}
