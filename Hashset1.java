package assignmentR;

import java.util.HashSet;

public class Hashset1 {

	public static void main(String[] args) {

        HashSet<String> name = new HashSet<>();
          
        name.add("Rahul");
        name.add("dipak");
        name.add("Sagar");
        
        System.out.println("Before appending:-"+name);
        
       
        name.add("Prashant");
        
        System.out.println("after appending '" + name );
	}

}
