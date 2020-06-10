package Bai2.VongLap.baitap.bai3.songuyento100;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String text = " ";
        for (int number = 2; number < 100; number++) {
                int i = 2;
                boolean check = true;
                while (i <= Math.sqrt(number)) {
                    if (number % i == 0) {
                        check = false;
                        break;
                    }
                    i++;
                }
            if (check){
                text += number + " ";
            }
        }
        System.out.println(text);
    }
}
