//Q.Create a class named 'Shape' with a method to print "This is this is shape". Then 
//create two other classes named 'Rectangle', 'Circle' inheriting the Shape class, both 
//having a method to print "This is rectangular shape" and "This is circular shape" 
//respectively. Create a subclass 'Square' of 'Rectangle' having a method to print 
//"Square is a rectangle". Now call the method of 'Shape' and 'Rectangle' class by the 
//object of 'Square' class. 

package assignmentR;

class shapes{
         public void shape() {
         	System.out.println("This is this shape");
         	
         }
}
 class Rectangles extends shapes{
	 public void rect() {
      	System.out.println("This is Rectanglular shape");
      }
 }
 class Circle extends shapes{
	 public void circ() {
      	System.out.println("This is Circlular shape");
      }
 }
 class squares extends Rectangles{
	 public void squ() {
      	System.out.println("Square is a Rectangle");
      	
      }
 }
 
public class InherisArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
          squares S=new squares();
          S.shape();
          S.squ();
   
	}

}
