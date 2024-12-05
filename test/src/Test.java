import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhập số thứ nhất: ");
        int a = scanner.nextInt();
        
        System.out.println("Nhập số thứ hai: ");
        int b = scanner.nextInt();
        
        // Gọi hàm tính tổng
        int sum = tinhTong(a, b);
        
        System.out.println("Tổng của hai số là: " + sum);
    }

    // Hàm tính tổng của hai số
    public static int tinhTong(int x, int y) {
        return x + y;
    }
}
