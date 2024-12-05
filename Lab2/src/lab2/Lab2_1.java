/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Lab2_1 {

    public static void main(String[] args) {
        int[] arr = {5, 10, 20, 15};
        System.out.println("Before array element: ");
        for (int a : arr) {
            System.out.print(a + " ");
        }
        arr [2] = 1;
        arr [3] = 20;
        System.out.println();
        System.out.println("After modify array element: ");
        for(int a : arr){
            System.out.print(a + " ");
        }
        System.out.println();
    }
}
