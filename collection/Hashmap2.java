//• Write a Java program to count the number of key-value (size) mappings in a map.  
package collection;

import java.util.HashMap;
import java.util.Map;

public class Hashmap2{
	
	public static void main(String[]args) {
		
		Map<String, Integer> name=new HashMap<>();
		
		name.put("Rahul", 1);
		name.put("meet", 2);
		name.put("keyur", 3);
		
		
		System.out.println("Name:-"+name);
		
        int size = name.size();

		System.out.println("size:-"+size);


		
	}
}
