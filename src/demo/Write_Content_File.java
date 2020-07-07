package demo;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Write_Content_File {
    public static void main(String[] args) {
        Write_Content_File write_content_file = new Write_Content_File();
        int[] x = {1, 1};
        write_content_file.method(x);
        System.out.printf("x=%d, y=%d", x[0], x[1]);
    }
    void method(int[] x) {
        x[0] = 5;
        x[1] = 5;
    }

}
