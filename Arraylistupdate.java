/* Q.Write a Java program to update specific array element by given element. 
*/

package assignmentR;

import java.util.ArrayList;

public class Arraylistupdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> name=new ArrayList<>();
		
		name.add("dipak");
		name.add("rahul");
		name.add("prashant");
		name.add("ravi");
		name.add("akhil");
		
	System.out.println("Before Update:-"+name);
	
	name.set(3, "denish");
	
	System.out.println("After Update:-"+name);

	}

}
