/*  Create a class to print the area of a square and a rectangle.The class has two methods 
with the same name but different number of parameters. The method for printing 
area of a rectangle has two parameters which are length and breadth respectively 
while the other method for printing area of square has one parameter which is side 
of square.*/ 

package assignmentR;

public class Area {
	
	public void area(int s) {
		int Square = s*s;
		System.out.println("Area of Square is: "+Square);
	}
	public void area(int l,int w){
		int rectangle=l*w;
		System.out.println("Araa of Rectangle is : "+rectangle);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Area a=new Area();
           a.area(5);
           a.area(4, 5);
	}

}
