package Mang.baitap.bai3.gop2mang;

import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner size = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng thứ nhất :");
        int arraysize = size.nextInt();
        int[] array = new int[arraysize];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = size.nextInt();
            i++;
        }
        System.out.println("Nhập số phần tử của mảng thứ hai :");
        int arraysize1 = size.nextInt();
        int[] array1 = new int[arraysize1];
        int j = 0;
        while (j < array1.length) {
            System.out.print("Enter element " + (j + 1) + ": ");
            array1[j] = size.nextInt();
            j++;
        }
        int[] array2 = new int[arraysize1 + arraysize];
        for(int t = 0 ; t < array.length; t++){
            array2[t] = array[t];
        }
        int l = 0;
        for (int f = array.length ; f < array2.length; f++){
            array2[f] =  array1[l];
            l++;
        }
        System.out.println(Arrays.toString(array2));
    }
}
