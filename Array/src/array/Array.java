/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array;

import java.util.Arrays;

/**
 *
 * @author Administrator
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        
//        int[] arr = {1,2,3,4,5,6,7,8,9,10};
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//        for (int i : arr) {
//            System.out.println(i);
//        }   
//
//        double[] arr = {60541012,9,8.5,10,10,7,9,9.5,10};
//        double sum = 0;
//        for (int i = 1; i < arr.length; i++) {
//            sum = sum+arr[i];
//        }
//        System.out.println(sum /(arr.length-1));
//            


        int[] arr = {2,4,1,3,6,5,7,9,8};
        String[] name = {"a","d","b","c","e","f","o","h","e","y","o"};
        
        System.out.println("Before sort: ");
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(name));
        
        System.out.println("After sort: ");
        Arrays.sort(arr);
        Arrays.sort(name);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(name));
    }
}
