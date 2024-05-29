//• Write a Java program to extract a portion of an array list.   


package collection;

import java.util.ArrayList;
import java.util.List;

public class ExtrectArraylist {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        for (int i = 1; i <= 10; i++) {
            arrayList.add(i);
        }
        
        System.out.println("Original ArrayList: " + arrayList);
        
        List<Integer> EL = arrayList.subList(2, 8); 
        
        // Print the extracted portion
        System.out.println("Extracted Portion: " + EL);
    }
}
