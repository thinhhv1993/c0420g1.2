package Mang.baitap.bai4.timohantulonnhattrongmang2chieu;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class timphantulonnhattrongmang2chieu {
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
        int arr1 = 0;
        int arr2 = 0;
        double max = array[arr1][arr2];
        for(int i =  0 ; i < array.length;i++){
            for (int j = 0 ; j < array[i].length ; j ++){
                if ( max <= array[i][j]){
                    max =  array[i][j];
                    arr1 = i;
                    arr2 = j;
                }
            }
        }
        System.out.println("Phần tử lớn nhất trong mảng " + max  + "max của mảng 2 chiều ở vị trí " + arr1 + "" + arr2);
    }
}
