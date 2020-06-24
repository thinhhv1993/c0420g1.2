package bai13.debugvsxulyngoaile.thuchanh.debugungdungjava;

import java.util.Scanner;

public class PtBac1 {

    public static void tinhNghiem(double a, double b, double c){
        if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("Equation pass with x = %f!\n", answer);
        }
        if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("Equation pass with x = %f!\n", answer);
        } else if (b == c) {
            System.out.print("Equation pass with any 'x'!");
        } else {
            System.out.print("Equation has no root!");
        }

    }
    public static void main(String[] args) {
        System.out.println("First Degree Equation Computer");
        System.out.println("Given a equation as 'a*x + b = c', please enter constants:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("\ta: ");
        double a = scanner.nextDouble();

        System.out.print("\tb: ");
        double b = scanner.nextDouble();

        System.out.print("\tc: ");
        double c = scanner.nextDouble();

        tinhNghiem(a,b,c);
    }
}
