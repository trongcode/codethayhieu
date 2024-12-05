/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class bai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Length: ");
        int a = sc.nextInt();
        System.out.println("Width: ");
        int b = sc.nextInt();
        int c = (a + b) * 2;
        int d = (a * b);
        System.out.println("Perimeter: " + (a + b) * 2);
        System.out.println("Area: " + (a * b));

    }
}
