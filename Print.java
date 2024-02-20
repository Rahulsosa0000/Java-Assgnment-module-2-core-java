package assignmentR;

public class Print {
	
          static void printn(int n,char c) {
        	  System.out.println("Integer : "+n +" Char :"+c);     
        	  }
          
          static void printn(char c,int n) {
        	  System.out.println("Char : "+c +" char :"+n);     
        	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Create a class to print an integer and a character with two methods having the same 
//		name but different sequence of the integer and the character parameters.
		
		printn(10,'r');
		printn('R',100);

	}

}
