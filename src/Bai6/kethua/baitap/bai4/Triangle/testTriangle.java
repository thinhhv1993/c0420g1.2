package Bai6.kethua.baitap.bai4.Triangle;

import java.util.Scanner;

public class testTriangle {
    public static void main(String[] args) {
        Scanner arr = new Scanner(System.in);
        System.out.print("Nhập side 1 : ");
        double side1 = Double.parseDouble(arr.nextLine());
        System.out.print("Nhập side 2 : ");
        double side2 = Double.parseDouble(arr.nextLine());
        System.out.print("Nhập side 3 : ");
        double side3 = Double.parseDouble(arr.nextLine());
        System.out.print("Nhập  color : ");
        String color = arr.nextLine();
        Shape triangle1 = new Triangle();
        System.out.println(triangle1);
        Shape triangle2 = new Triangle(color, true, side1, side2, side3);
        System.out.println(triangle2);

    }
}
