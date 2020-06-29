package bai11.thuattoantimkiem.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class CaiDatThuatToanTimKiemnhiPhanSuDungDeQuy {

    private static int binarySearch(int arr[], int low, int high, int value) {
        if (high>=low) {
            int mid = low + (high - low)/2;
            if (arr[mid] == value)
                return mid;
            if (arr[mid] > value)
                return binarySearch(arr, low, mid-1, value);
            return binarySearch(arr, mid+1, high, value);
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("Enter your size  array : ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i <array.length ; i++) {
            System.out.println("Enter your arr["+ i +"]");
            array[i]=scanner.nextInt();

        }
        Arrays.sort(array);
        System.out.println("Enter your number in array : ");
        int a = scanner.nextInt();
        int low = 0;
        int high = array.length-1;
        System.out.println(Arrays.toString(array));
        System.out.println("Number in your array = "+binarySearch(array,low,high,a));
    }
}
