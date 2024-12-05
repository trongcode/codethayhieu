/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sorting.algorithm;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class bubble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = {20, 8, 1, 23, 19, 5};
        System.out.println("befor sort: ");
        bubbleSort(arr);
    }
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println("");
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int arrs = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = arrs;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

