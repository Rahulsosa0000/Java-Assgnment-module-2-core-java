//Q. We have to calculate the area of a rectangle, a square and a circle.Create an abstract 
//class 'Shape' with three abstract methods namely 'RectangleArea' taking two 
//parameters, 'SquareArea' and 'CircleArea' taking one parameter each. The 
//parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its 
//side and that of 'CircleArea' is its radius. Now create another class 'Area' containing 
//all the three methods 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the 
//area of rectangle, square and circle respectively. Create an object of class 'Area' and 
//call all the three methods.


package assignmentR;

abstract class shape{
	public abstract void RectangleArea(int length, int breadth);
	public abstract void SquareArea(int side);
	public abstract void CircleArea(int radius);
}

    class Areas extends shape{
    	
    	public void RectangleArea(int length, int breadth) {
    		int result1=length*breadth;
    		System.out.println("Area of Rectangle:-"+result1);
    		
    	}

		
		public void SquareArea(int side) {
			int result2=side*side;
			
			System.out.println("Area of Square:-"+result2);
		}

		
		public void CircleArea(int radius) {
			float result3=(float) (Math.PI*radius*radius);
			System.out.println("Area of Rectangle:-"+result3);
		}
    }


public class Area3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Areas a=new Areas();
            a.RectangleArea(10, 20);
            a.SquareArea(20);
            a.CircleArea(12);
	}

}
