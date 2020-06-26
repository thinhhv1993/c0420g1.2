package demo;

import java.io.*;

public class thows_exception {
    public static void main(String[] args){
        try {
            ghiFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Khi gọi phương thức ghiFile() phải xử lý exception
//        try {
//            ghiFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    private static void ghiFile() throws  IOException {
        //Ném ngoại lệ cho class khác xử lý
        FileOutputStream outputStream;
        outputStream = new FileOutputStream("E://file.txt");
        outputStream.write(65);
        outputStream.close();
    }
}
