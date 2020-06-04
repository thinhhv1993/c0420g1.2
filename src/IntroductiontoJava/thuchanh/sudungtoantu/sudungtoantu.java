package IntroductiontoJava.thuchanh.sudungtoantu;
import java.util.Scanner;
//Cần import lớp Scanner từ gói java.util.
public class sudungtoantu {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in);
        //Sử dụng đối tượng Scanner để lấy dữ liệu nhập vào từ người dùng
        System.out.println("Enter width: ");
        width = scanner.nextFloat();

        System.out.println("Enter height: ");
        height = scanner.nextFloat();
        float area = width * height;

        System.out.println("Area is: " + area);

    }
}
