package Mang.baitap.bai1.chenphantuvaomang;

import java.util.Arrays;
import java.util.Scanner;

public class chenphantu {
    public static void main(String[] args) {
        int[] array = {10,9,8,7,6,5,4,3,2,1,0,0};
        Scanner arr = new Scanner(System.in);
        System.out.print("Enter numb:");
        int numb = arr.nextInt();
        System.out.print("Enter index:");
        int index = arr.nextInt();
        if( index <= 1 || index > array.length){
            System.out.println("không chèn được phần tử vào mảng.");
        }else {
            for (int i = array.length - 2; i >= index ; i--  ){
                array[i + 1] = array[i];
            }
            array[index] = numb;
        }
        System.out.println(Arrays.toString(array));
    }
}
