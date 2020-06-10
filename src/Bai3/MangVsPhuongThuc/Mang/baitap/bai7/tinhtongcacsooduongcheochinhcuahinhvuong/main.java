package Bai3.MangVsPhuongThuc.Mang.baitap.bai7.tinhtongcacsooduongcheochinhcuahinhvuong;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        boolean check = false;
        do {
            Scanner arr = new Scanner(System.in);
            System.out.print("Nhập số phần tử của mảng thứ lớn :");
            int numb = arr.nextInt();
            System.out.print("Nhập số phần tử của mảng thứ con :");
            int numb1 = arr.nextInt();
            double[][] array = new double[numb][numb1];
            for (int row = 0; row < array.length; row++) {
                for (int column = 0; column < array[row].length; column++) {
                    System.out.print("Nhập số phần tử của mảng thứ  :" + row + column + "của mảng array");
                    array[row][column] = arr.nextInt();
                }
            }
            if (numb1 == numb) {
                int i =  0 ;
                int j =  0 ;
                int total = 0;
                while (i < array.length){
                    total += array[i][j];
                    i++;
                    j++;
                }
                System.out.println("Tổng các số của đường chéo trong mảng hình vuông là = " + total);
                check = true;
            }
            else {
                System.out.println("Mảng bạn vừa nhập là hình chữ nhật. Mời nhập lại.");
                check = false;
            }
        }while(!check);

    }
}
