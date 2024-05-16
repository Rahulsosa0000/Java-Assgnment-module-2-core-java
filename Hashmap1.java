package assignmentR;

import java.util.HashMap;

public class Hashmap1 {

	public static void main(String[] args) {

		HashMap<Integer,String> num = new HashMap<>();
		
		num.put( 1,"rahul");
		num.put(2,"keyur");
		num.put( 3,"deepak");
		
		System.out.println("Before update value:-"+num);
		
		num.put(4,"raju");
		num.put(5,"guatam");
		
		System.out.println("After update Value:-"+num);

	}

}
