package demo;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Write_Content_File {
    public static void main(String[] args) {
        String string = "aBcd";
        String temp[] = string.split("");
        String str ="";
        str += String.valueOf(temp[0].charAt(0)).toUpperCase();
        for (int i = 1; i < temp.length; i++) {
            str += String.valueOf(temp[i].charAt(0)).toLowerCase();
        }
        System.out.println(str);
    }
}
