/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taixiu;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * 
 * @author Administrator
 */
public class Taixiu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("chao cac ban den voi Go88");
        System.out.println("chon tai (1) - xiu  (0)");
        int bet = scanner.nextInt(); // 1 cho tài, 0 cho xỉu

        // Ném hai viên xúc xắc
        int die1 = random.nextInt(6) + 1; // Xúc xắc 1
        int die2 = random.nextInt(6) + 1; // Xúc xắc 2
        int total = die1 + die2; // Tổng điểm

        System.out.println("Ket qua cua phien cuoc: " + die1 + " va " + die2);
        System.out.println("Ket qua: " + total);

        // Kiểm tra kết quả
        boolean isTai = total > 10; // Tài nếu tổng điểm > 6, xỉu nếu tổng điểm <= 6
        if ((isTai && bet == 1) || (!isTai && bet == 0)) {
            System.out.println("ban thang chuc mung!");
        } else {
            System.out.println("ban thua chuc ban may man lan sau.");
        }

        scanner.close();
    }
    
}
