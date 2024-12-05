/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sorting.algorithm;
public class insertSort {
    public static void main(String[] args) {
        int[] Arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Arrays before sorting:");
        printArray(Arr);

        insertionSort(Arr); 

        System.out.println("Arrays after sorting:");
        printArray(Arr);
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] < key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key; 
        }
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
