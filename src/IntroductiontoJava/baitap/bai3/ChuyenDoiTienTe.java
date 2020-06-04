package IntroductiontoJava.baitap.bai3;

import java.util.Scanner;
public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số USD : ");
        usd = sc.nextInt();
        double quydoi = usd * 23000;
        System.out.println("Giá trị VND : " + quydoi);
    }
}
