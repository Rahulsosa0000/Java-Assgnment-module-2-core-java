package assignmentR;

public class PrintNumber {
	
//	Create a class named 'Print Number' to print various numbers of different data types 
//	by creating different methods with the same name 'printn' having a parameter for 
//	each data type.
	
	
	public void printn (int n) {
		System.out.println("Integer: "+n);
	}
	
	public void printn (float n) {
		System.out.println("float: "+n);
	}
	
	public void printn (double n) {
		System.out.println("double: "+n);
	}
	
	public void printn (char n) {
		System.out.println("char: "+n); 
	}
	
	public void printn (String n) {
		System.out.println("String: "+n);
	}
	
	public void printn (long n) {
		System.out.println("long: "+n);
	}
	
	public void printn (boolean n) {
		System.out.println("boolean: "+n);
	}
	
	
	public static void main(String[] args) {
		
		PrintNumber ob= new PrintNumber();
	    ob.printn(10);
		ob.printn(10.20f);
		ob.printn(3.14159);
		ob.printn("Hello world");
		ob.printn(12000000000L);
		ob.printn(true);
		ob.printn('a');
		
		
		
		

	}

}
