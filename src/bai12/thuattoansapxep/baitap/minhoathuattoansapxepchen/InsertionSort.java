package bai12.thuattoansapxep.baitap.minhoathuattoansapxepchen;

import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int k;
            int curentElement=list[i];
            for (k = i - 1; k >= 0 && list[k] > curentElement; k--) {
                list[k + 1] = list[k];
            }
            list[k + 1] = curentElement;
            System.out.println("chèn "+list[k+1] );
            System.out.println("");
            System.out.print("List after the  " + i + "' sort: ");
            for (int j = 0; j < list.length; j++) {
                System.out.print(list[j] + "\t");
            }
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Your input list: " );
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println("\n");
        insertionSort(list);

    }
}
