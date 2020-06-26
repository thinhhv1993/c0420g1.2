package demo;

import java.util.Scanner;

public class ex1_exception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 số: ");
        int number = scanner.nextInt();
        /*Nếu người dùng nhập vào là String thì sẽ xảy ra lỗi
        */
        System.out.println("Số đã nhập vào là: " + number);
    }
}
