//Q.Write a Java program to insert an element into the array list at the first position. 

package assignmentR;

import java.util.ArrayList;

public class Arraylist3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<Integer> num=new ArrayList<>();
       
       num.add(20);
       num.add(30);
       num.add(40);
       num.add(50);
       
       System.out.println("Before Add Element values"+num);
       
       num.addFirst(10);
       
       System.out.print("After Add Element"+num);
	}

}
