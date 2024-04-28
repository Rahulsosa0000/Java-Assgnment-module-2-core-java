//Q.W.A.J.P to create a custom exception if Customer withdraw amount which is greater 
//than account balance then program will show custom exception otherwise amount 
//will deduct from account balance. Account balance is: 2000 Enter withdraw amount: 
//2500

package assignmentR;

import java.util.Scanner;

public class CustomExcep {
	

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
         System.out.println("Enter the Amount:-");
         Scanner sc=new Scanner(System.in);
         int Amount=sc.nextInt();
         
         if(Amount>2000) {
        	 
  throw new  Exception("Custom Exception"+
 "Sorry, insufficient balance, you need more 500 Rs. To perform this transaction.");
         }
         else {
        	 System.out.println("amount will deduct from account");
         }
	}

}
