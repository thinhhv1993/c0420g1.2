package Bai2.VongLap.thuchanh.timuocchunglonnhat;

import java.util.Scanner;

public class timuocchunglonnhat {
    public static void main(String[] args) {
        //Khai báo hai biến số nguyên a, b và nhập giá trị cho a, b từ bàn phím
        int a, b;
        Scanner nhap = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = nhap.nextInt();
        System.out.println("Enter b: ");
        b = nhap.nextInt();
        //Sử dụng hàm abs() để trả về giá trị tuyệt đối (phần dương) của a, b
        a = Math.abs(a);
        b = Math.abs(b);
        //Kiểm tra a, b có bằng 0 hay không
        if (a == 0 || b == 0)
            System.out.println("No greatest common factor");
        // Tìm ước số chung lớn nhất của a, b
        //Sử dụng vòng lặp kiểm tra trong khi a khác b thì
        //Nếu a < b: a = a – b
        //Còn lại b = b – a
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("Greatest common factor: " + a);
    }
}
