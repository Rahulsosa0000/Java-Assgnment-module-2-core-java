//Create an abstract class 'Parent' with a method 'message'. It has two subclasses each 
//having a method with the same name 'message' that prints "This is first subclass" 
//and "This is second subclass" respectively. Call the methods 'message' by creating 
//an object for each subclass. 



package assignmentR;

 abstract class parent{
	
	public abstract void check();
	
}
  class sub1 extends parent{
	  
	  public void check() {
		  System.out.println("this is subclass 1");
	  }
  }
    class sub2 extends parent{
    	
    	public void check() {
    		System.out.println("This is Subclass 2");
    	}
    }
 
public class checkAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent p=new sub1();
		parent p2=new sub2();	
		p.check();
		p2.check();

		

	}

}
