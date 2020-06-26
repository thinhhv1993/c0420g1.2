package bai13.debugvsxulyngoaile.baitap.sudunglopIllegalTriangleException;

//import java.util.InputMismatchException;
import java.util.Scanner;

public class testIllegalTriangleException {
    public static void illegalTriangleException(double a, double b, double c) {
        Scanner scanner = new Scanner(System.in);
        boolean check = false;
        while (!check) {
            try {
                System.out.print("\ta: ");
                a = Double.parseDouble(scanner.nextLine());

                System.out.print("\tb: ");
                b = Double.parseDouble(scanner.nextLine());

                System.out.print("\tc: ");
                c = Double.parseDouble(scanner.nextLine());
                if (a <= 0 || b <= 0 || c <= 0 || (a + b < c) || (a + c < b) || (b + c < a)) {
                    throw new IllegalTriangleException("tam giác sai định dạng");
                } else {
                    System.out.println("tam giác đúng định dạng");
                    check = true;
                }
            } catch (IllegalTriangleException e) {
                System.out.println(e);
                System.out.println("mời nhập lại");
                check = false;
            }
//            } catch (InputMismatchException e) {
//                System.err.println("khong duoc nhap chu");
//                System.out.println("mời nhập lại");
//                check = false;
//            }
            catch (NumberFormatException e){
                System.err.println("khong duoc nhap chu");
                System.out.println("mời nhập lại");
                check = false;
            }
            catch (Exception e) {
                e.printStackTrace();
                check = false;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Nhập 3 cạnh của 1 tam giác");
        double a = 0;
        double b = 0;
        double c = 0;
        illegalTriangleException(a, b, c);
    }
}

