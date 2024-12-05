/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3;

import java.util.Stack;

/**
 *
 * @author Administrator
 */
public class stack_push {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stack<Integer> st = new Stack<>();

        System.out.println("Befor element: " + st);
        st.push(60);
        st.push(50);
        st.push(30);
        st.push(40);
        st.push(30);
        st.push(20);
        st.push(10);

        System.out.println("After add element: " + st);

//        System.out.println("Remove element first: " + st.pop());

        System.out.println("After Remove element: " + st);
        
        System.out.println("Browse the element in the stack: ");
        st.forEach(n -> {
            System.out.println(n);
        });
        st.add(70);
        System.out.println("Browse the element in the stack: " + st);

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
