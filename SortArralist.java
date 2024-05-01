package assignmentR;

import java.util.ArrayList;
import java.util.Collections;

public class SortArralist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> num=new ArrayList<>();
		
		num.add(8);
		num.add(5);
		num.add(2);
		num.add(6);
		num.add(1);
		
		System.out.println("Before Sorting ArraList:-"+num);
		
		Collections.sort(num);
		
		System.out.println("After Sorting ArrayList:-"+num);
		
		
	}

}
