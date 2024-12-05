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
public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(">>>>  Bang gia tinh tien dien   <<<<<");
        System.out.print("vui long nhap so dien: ");
        int a = sc.nextInt();
        int b = a * 1000;
        int c = 100 * 1000 +(a - 100)* 1500 ;
        if(a <= 100){
            System.out.println("Tong so tien dien cua ban la: "+a + "vnd");
        }else if(a > 100){
            System.out.println("Tong so tien dien cua ban la: "+c + "vnd");
        }
        sc.close();
    }
}
