package lab4;

import java.util.ArrayList;
import java.util.Collections; // Import đúng lớp Collections

public class Lab4_2 {
    public static void main(String[] args) {
        
        ArrayList<Integer> arrInt = new ArrayList<>();
        arrInt.add(1);
        arrInt.add(2);
        arrInt.add(3);
        arrInt.add(5);
        arrInt.add(7);
        arrInt.add(9);
        arrInt.add(6);
        arrInt.add(8);
        arrInt.add(4);

        
        System.out.println("Before array sort: " + arrInt);

        
        Collections.sort(arrInt);

        
        System.out.println("After array sort: " + arrInt);
    }
}
