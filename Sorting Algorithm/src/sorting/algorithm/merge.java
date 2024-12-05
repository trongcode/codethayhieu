/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sorting.algorithm;
public class merge {
    public static void main(String[] args) {
        int[] numbers = {12, 11, 13, 5, 6, 7};

        System.out.println("Original array:");
        printArray(numbers);

        mergeSort(numbers, 0, numbers.length - 1);

        System.out.println("Sorted array:");
        printArray(numbers);
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            // Sắp xếp hai nửa
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Gộp hai nửa đã sắp xếp
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Tạo các mảng tạm
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Sao chép dữ liệu vào các mảng tạm
        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        // Gộp lại
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Sao chép phần còn lại của L nếu có
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Sao chép phần còn lại của R nếu có
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

