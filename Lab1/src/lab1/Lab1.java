/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Lab1 {
//Bai3
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Enter your age: ");
        String age = sc.nextLine();
        System.out.print("Name: " + name);
        System.out.println(", Age: " + age);
    }
}
