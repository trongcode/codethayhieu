/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sorting.algorithm;
import java.util.Arrays;

public class selection {
    public static void main(String[] args) {
        
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};

        
        System.out.println("Original array:");
        System.out.println(Arrays.toString(numbers));

        
        selectionSort(numbers);

        
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(numbers));
    }

    
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        
        for (int i = 0; i < n - 1; i++) {
            
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}

