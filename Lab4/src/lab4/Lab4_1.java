/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Lab4_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList myLists = new ArrayList();
        myLists.add("9");
        myLists.add("1");
        myLists.add("3");
        myLists.add("7");
        myLists.add("2");
        myLists.add("4");
        myLists.add("5");
        
        System.out.println("Print All the Objects: "+myLists);
        
        Collections.sort(myLists);

        System.out.println("Print All the Objects (sorted): ");
        for (int i = 0; i < myLists.size(); i++) {
            System.out.println(myLists.get(i));
        }
        
        System.out.println("Object element index 3 is: "+myLists.get(3));
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap phan tu muon tim: ");
        String List = sc.nextLine();
        
        if (myLists.contains(List)) {
            System.out.println("Phan tu "+List+ " co trong danh sach");
        }else{
            System.out.println("Phan tu "+List+ " khong co trong danh sach");
        }
        
//        
//        boolean containsExample  = myLists.contains("Example");
//        System.out.println("phan tu co ton tai hay khong? "+containsExample);
//        System.out.println("");
        
        System.out.println("Size of Object myList: "+myLists.size());
        
    }
    
    
}
