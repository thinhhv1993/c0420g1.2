package Mang.baitap.bai6.tinhtongcacsomotcotxacdinh;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner arr = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng thứ lớn :");
        int numb = arr.nextInt();
        System.out.print("Nhập số phần tử của mảng thứ con :");
        int numb1 = arr.nextInt();
        double[][] array = new double[numb][numb1];
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.print("Nhập số phần tử của mảng thứ  :" + row + column +"của mảng array");
                array[row][column] = arr.nextInt();
            }
        }
        System.out.print("Bạn muốn tính tổng ở cột thử mấy trong mảng :");
        int numb2 = arr.nextInt();
        int total = 0;
        int numb3 = numb2 -1;
           for (int row = 0; row < array[numb3].length; row++){
            total += array[numb3][row];
        }
        System.out.println("Sum for column " + numb2 + " is "
                + total);
    }
}
