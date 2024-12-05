/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class test {
    public static void main(String[] args) {
        stack(args);
    }
    public static void stack(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] a = new String[5];
        System.out.println("enter number: ");
        
        for (int i = 0; i < 5; i++) {
            System.out.println("enter 5 number: " +(i + 1) + "");
            a[i] = sc.next();
        }
        System.out.println("after enter 5 number: ");
        for (String ab : a) {
            System.out.println(ab);
        }
    }
}
