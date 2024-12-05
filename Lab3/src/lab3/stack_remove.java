/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

import java.util.Stack;

/**
 *
 * @author Administrator
 */
public class stack_remove {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println("Before remove element: "+st);
//        
//        System.out.println("Remove element: "+st.pop());
//        System.out.println("Remove element: "+st.pop());
//        System.out.println("Remove element: "+st.pop());
        
        System.out.println("After remove element: "+st);
        
        searchInstack(st, 50);
        searchInstack(st, 60);
    }
    public static void searchInstack(Stack<Integer> st, int a) {
        if (st.contains(a)) {
            System.out.println("phan tu " + a + " co ton tai");
        } else {
            System.out.println("phan tu " + a + " khong ton tai");
        }
    }
}
