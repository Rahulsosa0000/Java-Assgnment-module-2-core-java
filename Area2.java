/* Create a class named 'Rectangle' with two data members 'length' and 'breadth' and 
two methods to print the area and perimeter of the rectangle respectively. Its 
constructor having parameters for length and breadth is used to initialize the length 
and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle' class with its 
constructor having a parameter for its side (suppose s) calling the constructor of its 
parent class as 'super (s, s)'. Print the area and perimeter of a rectangle and a square.*/

package assignmentR;

 class Rectangle{
	 int length;
	 int breadth;
	 public void Area() {
		 int result=length*breadth;
		 System.out.println("Area of Rectangle :"+result);
	 }
	 public void Perimeter() {
		 int p=(length+breadth)*2;
		 System.out.println("Perimiter of Rectangle:"+p);
	 }
	public Rectangle(int length,int breadth){
		this.length=length;
		this.breadth=breadth;
		
	 }
 }
 
 class Square extends Rectangle{

	 Square(int s) {
		super(s, s);
		int ans=s*s;
		System.out.println("Area of Square:-"+ans);
		
	}
}
	 
 public class Area2 {

	public static void main(String[] args) {
		Rectangle r=new Rectangle(10,20);
		r.Area();
		r.Perimeter();
		Square s=new Square(10);
		s.Area();
		s.Perimeter();
             
	}

}
