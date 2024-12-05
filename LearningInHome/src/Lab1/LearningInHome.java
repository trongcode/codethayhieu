/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab1;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class LearningInHome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("<< Xin moi ban chon >>");
        System.out.println("1. Cong");
        System.out.println("2. Tru");
        System.out.println("3. Nhan");
        System.out.println("4. Chia");
        System.out.println("5. Exit");
        Scanner sc = new Scanner(System.in);
        System.out.println("Lua chon cua ban la: ");
        int luaChon = sc.nextInt();
        switch (luaChon) {
            case 1:
                System.out.println("Ban da lua chon phep cong");
                break;
            case 2:
                System.out.println("Ban da lua chon phep tru");
                break;
            case 3:
                System.out.println("Ban da lua chon phep nhan");
                break;
            case 4:
                System.out.println("Ban da lua chon phep chia");
                break;
            case 5:
                System.out.println("Ban da thoat chuong trinh");
                break;
            default:
                System.out.println("Lua chon cua ban khong dung");
        }
        sc.close();
    }
}
