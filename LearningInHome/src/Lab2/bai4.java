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
public class bai4 {

    public static void bai1() {
        System.out.println("Ban da lua chon bai 1");
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

    public static void bai2() {
        System.out.println("Ban da lua chon bai 2");
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

    public static void bai3() {
        System.out.println("Ban da lua chon bai 3");
        Scanner sc = new Scanner(System.in);
        System.out.println(">>>>  Bang gia tinh tien dien   <<<<<");
        System.out.print("vui long nhap so dien: ");
        int a = sc.nextInt();
        int b = a * 1000;
        int c = 100 * 1000 + (a - 100) * 1500;
        if (a <= 100) {
            System.out.println("Tong so tien dien cua ban la: " + a + "vnd");
        } else if (a > 100) {
            System.out.println("Tong so tien dien cua ban la: " + c + "vnd");
        }
        sc.close();

    }

    public static void ketthuc() {
        System.out.println("Ban da thoat chuong trinh");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(">>>>>>>>>>>>   Duoi day la cac lua chon   <<<<<<");
        System.out.println("Bai 1: giai phuong trinh bac nhat");
        System.out.println("Bai 2: giai phuong trinh bac 2");
        System.out.println("Bai 3: tinh tien dien");
        System.out.println("4:     Ket Thuc Chuong Trinh");
        System.out.println("");
        System.out.println("Lua Chon Cua Ban: ");
        int x = sc.nextInt();
        switch (x) {
            case 1:
                bai1();

                break;
            case 2:
                bai2();
                break;
            case 3:
                bai3();
                break;
            case 4:
                ketthuc();
                break;
            default:
                System.out.println("Lua chon cua ban khong dung");
        }
        sc.close();
    }
}
