package VongLap.thuchanh.vonglapdowhile;
import java.util.Scanner;
public class Vonglapdowhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password;
        do {
            password = sc.nextLine();
        } while (password != "vung oi mo ra");
    }
}
