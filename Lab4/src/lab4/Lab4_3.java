/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;
import java.util.Scanner;
import java.util.Arrays;

public class Lab4_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số lượng tên
        System.out.print("Nhập số lượng tên: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Đọc dòng còn lại

        // Tạo mảng chứa tên
        String[] names = new String[n];

        // Nhập tên
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập tên " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        // Xuất mảng trước khi xóa
        System.out.println("Mảng trước khi xóa: " + Arrays.toString(names));

        // Nhập tên cần xóa
        System.out.print("Nhập tên cần xóa: ");
        String nameToRemove = scanner.nextLine();

        // Tìm và xóa tên
        names = removeName(names, nameToRemove);

        // Xuất mảng sau khi xóa
        System.out.println("Mảng sau khi xóa: " + Arrays.toString(names));
    }

    // Phương thức để xóa tên trong mảng
    public static String[] removeName(String[] names, String nameToRemove) {
        return Arrays.stream(names)
                .filter(name -> !name.equalsIgnoreCase(nameToRemove)) // Lọc ra tên không cần xóa
                .toArray(String[]::new); // Chuyển đổi lại thành mảng
    }
}

