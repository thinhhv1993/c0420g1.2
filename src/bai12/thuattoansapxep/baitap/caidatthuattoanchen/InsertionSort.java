package bai12.thuattoansapxep.baitap.caidatthuattoanchen;

import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(int[] list){
        for (int i = 1; i < list.length; i++){
//insert list[i] into a sorted sublist list[0...i-1]
//so that list[0..i] is sorted
            int currentElement = list[i];
            int k;
            for(k = i - 1; k >=0 && list[k] > currentElement; k--){
                list[k+1] = list[k];
            }
//insert the current elemtn into list[k+1]
            list[k+1] = currentElement;
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
