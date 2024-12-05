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
public class bai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cho phuong trinh ax2 + bx + c = 0");
        System.out.print("Vui long nhap a = ");
        double a = sc.nextDouble();
        System.out.print("Vui long nhap b = ");
        double b = sc.nextDouble();
        System.out.print("Vui long nhap c = ");
        double c = sc.nextDouble();
        double delta = b * b - 4 * a * c;
        double x = -c / b;
        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
        double y = -b / 2 * a;
        if (a == 0) {
            if (b != 0) {
                System.out.println("Nghiem cua phuong trinh la: " + x);
            } else if (c == 0) {
                System.out.println("phuong trinh vo so nghiem");
            } else {
                System.out.println("phuong trinh vo nghiem");
            }
        } else {
            if (delta > 0) {
                System.out.println("Phuong trinh co 2 nghiem phan biet: ");
                System.out.println("X1 = " + x1);
                System.out.println("X2 = " + x2);
            } else if (delta == 0) {
                System.out.println("phuong trinh co nghiem kep: " + y);
            } else {
                System.out.println("phuong trinh vo nghiem");
            }
            sc.close();
        }
    }
}
