//Define a method that will display grades according to the marks 
//entered as below: 
//Marks Grade 
//91-100 AA 
//81-90 AB 
//71-80 BB 
//61-70 BC 
//51-60 CD 
//41-50 DD 
//40 Fail 

package assignmentR;

import java.util.Scanner;

public class Marksgrade {
	
	public static void diplaygrades(int marks) {
		if(marks>91&& marks<=100) {
			System.out.println("your grade is AA.");
		}
		else if(marks>81&& marks<90) {
			System.out.println("Your grade is AB.");
		}
		else if(marks>71 && marks<80) {
			System.out.println("Your grade is BB.");
		}
		else if(marks>61 && marks<70) {
			System.out.println("Your grade is BC.");
		}
		else if(marks>51 && marks<60) {
			System.out.println("Your grade is CD.");
		}
		else if(marks>41 && marks<50) {
			System.out.println("Your grade is DD.");
		}
		else if(marks<40){
			System.out.println("you are fail.");
		}
		else {
			System.out.println("Invalid Enter Marks.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   System.out.println("Enter the Marks:-");
           Scanner sc=new Scanner(System.in);
           int Marks=sc.nextInt();
           diplaygrades(Marks);
	}

}
