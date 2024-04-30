//Q.Write a Java program to iterate through all elements in an array list.

package assignmentR;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterateelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> name =new ArrayList<>();
		name.add("Denish");
		name.add("Prashant");
		name.add("Dipak");
		name.add("Akhil");
		name.add("Dilip");
		name.add("Jaydeep");
		name.add("Keyur");
		
		Iterator<String> List = name.iterator();
		
		while(List.hasNext()) {
			String Studentname=List.next();
			
			System.out.println("Student Name:-"+Studentname);
		}



	}

}
