package assignmentR;



public class Numdiv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 
		//and by both. 
		
		System.out.print("divided by 3:-");
		for(int i=3;i<=100;i++) {
			if(i%3==0) {
				System.out.print(" "+i+" ");
			}
			
		}
		System.out.println();

		
		System.out.print("divided by 5:-");
		for(int i=5;i<=100;i++) {
			if(i%5==0) {
				System.out.print(" "+i);
			}
			
		}
		System.out.println();

		
		System.out.print("divided by 3&5:-");
		for(int i=5;i<=100;i++) {
			if(i%3==0&&i%5==0) {
				System.out.print(" "+i);
			}
			
		}
		
		
		
		
		}

	}


