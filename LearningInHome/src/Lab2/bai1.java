/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class bai1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("<<<<< Giai phuong trinh sau >>>");
        System.out.println("Co phuong trinh ax + b = 0, hay nhap a va b de tim ra ket qua: ");
        System.out.print("Vui long nhap so a = ");
        double a = sc.nextDouble();
        System.out.print("Vui long nhap so b = ");
        double b = sc.nextDouble();
        double x = -b / a;;
        if (a != 0) {
            System.out.println("Nghiem cua phuong trinh la: " + x);
        } else if (b == 0) {
            System.out.println("phuong trinh vo so nghiem.");
        } else {
            System.out.println("phuong trinh vo nghiem.");
        }
        sc.close();
    }

}
