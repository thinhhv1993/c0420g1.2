package Bai2.VongLap.thuchanh.vonglapwhile;
import java.util.Scanner;
public class Vonglapwhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Không đúng! Mời bạn nhập lại mật khẩu: ");
        String password = sc.nextLine();
        while (password != "vung oi mo ra") {
            System.out.println("Không đúng! Mời bạn nhập lại mật khẩu: ");
            password = sc.nextLine();
        }
    }
}
