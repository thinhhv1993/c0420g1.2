package bai14.textfile.baitap.coppyfiletext;

import java.io.*;
import java.util.Scanner;

public class copyFile {
    static final String PATH = "src\\bai14\\textfile\\baitap\\coppyfiletext";

    private static void copyFile(String newFile, String filePath) {

        // tạo mới file đến nếu file đến chưa có
        File dir = new File(PATH);
        dir.mkdir();
        File file = new File(PATH, newFile);
        try {
            if (file.createNewFile()) {
                System.out.println("File created..");
            } else {
                System.out.println("File already exists..");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // đọc dữ liệu từ file gốc
        File file2=new File(filePath);
        StringBuffer str=new StringBuffer();
        try {
            if (!file2.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br =new BufferedReader(new FileReader(file2));
            String line="";
            while ((line=br.readLine())!=null){
                str.append(line).append("\n");
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // viết các dữ liệu đã đọc ở file gốc vào file đến
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
            fileWriter.write(String.valueOf(str));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập đường dẫn file để copy: ");
        String fileCopy = scanner.nextLine();
        System.out.println("Nhập tên file mới: ");
        String File = scanner.nextLine();
        copyFile(File, fileCopy);

    }
}
