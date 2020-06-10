package Bai2.VongLap.thuchanh.thietkemenuchoungdung;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //Khai báo biến choice lưu giá trị chọn lựa
        int choice;
        //Tạo đối tượng input thuộc lớp Scanner để nhập liệu
        Scanner input = new Scanner(System.in);
        //Hiển thị thông tin menu gồm 3 lựa chọn
        System.out.println("Menu");
        System.out.println("1. Draw the triangle");
        System.out.println("2. Draw the square");
        System.out.println("3. Draw the rectangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        //Sử dụng cấu trúc switch…case để cho phép người dùng xử lý các tình huống lựa chọn
        //(Ngoài ra bạn có thể sử dụng cấu trúc if..else)
        while (true) {
             choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Draw the triangle");
                    System.out.println("******");
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;
                case 2:
                    System.out.println("Draw the square");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 3:
                    System.out.println("Draw the rectangle");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
                    //Để menu lựa chọn lặp lại cho người dùng nhập. Đặt toàn bộ đoạn hiển thị menu và xử lý tình huống lựa chọn vào vòng lặp while.
                    //Điều kiện để vòng lặp while lúc này thực thi được là choice != 0
            }
        }
    }
}
