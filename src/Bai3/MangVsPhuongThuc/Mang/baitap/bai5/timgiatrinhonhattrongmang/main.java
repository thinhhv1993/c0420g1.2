package Bai3.MangVsPhuongThuc.Mang.baitap.bai5.timgiatrinhonhattrongmang;

import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner arr = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng :");
        int numb = arr.nextInt();
        int[] array;
        array = new int[numb];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element" + (i + 1) + " : ");
            array[i] = arr.nextInt();
            i++;
        }
        System.out.println(Arrays.toString(array));
        int min = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] < min) {
                min = array[j];
                index = j + 1;
            }
        }
        System.out.println("The largest property value in the list is " + min + " ,at position " + index);
    }
}
