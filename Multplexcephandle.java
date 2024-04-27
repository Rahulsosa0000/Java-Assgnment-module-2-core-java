//Q.W.A.J. P to demonstrate multiple catch blocks, (one is to handle divide by zero 
//exception and another one is to handle 
//ArrayIndexOutOfBoundException) int a [] =new int [5]; a [5]=30/0; 


package assignmentR;

public class Multplexcephandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			int arr[]=new int[5];	
			arr[5]=31/0;
			System.out.println(arr);
		}catch(ArithmeticException e) {
			System.out.println("We can not divide by zero."+e);
		}
			
	
		catch(Exception f) {
			System.out.println("we enter more then size."+f);
		}
		
	}

}
