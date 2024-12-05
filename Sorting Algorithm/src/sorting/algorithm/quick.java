/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sorting.algorithm;

/**
 *
 * @author Administrator
 */
public class quick {
    public static void main(String[] args) {
        int[] numbers = {10, 7, 8, 9, 1, 5};

        System.out.println("Original array:");
        printArray(numbers);

        quickSort(numbers, 0, numbers.length - 1);

        System.out.println("Sorted array:");
        printArray(numbers);
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Tìm chỉ số phân vùng
            int pi = partition(arr, low, high);

            // Sắp xếp các phần tử trước và sau chỉ số phân vùng
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Chọn phần tử cuối làm pivot
        int i = (low - 1); // Chỉ số của phần tử nhỏ hơn

        for (int j = low; j < high; j++) {
            // Nếu phần tử hiện tại nhỏ hơn hoặc bằng pivot
            if (arr[j] <= pivot) {
                i++;
                // Hoán đổi arr[i] và arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Hoán đổi arr[i + 1] và arr[high] (pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // Trả về chỉ số của pivot
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
