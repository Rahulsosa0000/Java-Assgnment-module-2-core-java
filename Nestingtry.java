//Q. W.A.J. P to implement the above program (pro.no-B27) using nesting of try-catch 
//block.


package assignmentR;

public class Nestingtry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int a=10;
            int b=0;
            int c;
            int arr[]=new int[5];
		try {
			c=a/b;
		}catch(ArithmeticException A) {
			System.out.println("We can not divided by zero"+A);
		}
         try {
			arr[5]=30;
			System.out.println(arr);
		}catch(Exception e) {
			System.out.println("size is out of array."+e);
		}
	}

}
