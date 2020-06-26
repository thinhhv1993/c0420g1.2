package demo;

import java.io.IOException;
import java.util.Scanner;

public class thow_exception {
    //Dùng thow để tự mình ném ra exception
    private static int nhapTuoiNhanVien() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập tuổi nhân viên: ");
        int tuoi = scanner.nextInt();
        if (tuoi < 0) throw new IOException("tuổi không được nhỏ hơn 0.");
        return tuoi;
    }

    public static void main(String[] args) {
        try {
            int tuoi = nhapTuoiNhanVien();
            System.out.println("Tuổi đã nhập: " + tuoi);
        } catch (IOException e) {
            System.out.println("Tuổi nhập vào chưa hợp lệ. Lỗi: " + e.toString());
        }
    }
}
