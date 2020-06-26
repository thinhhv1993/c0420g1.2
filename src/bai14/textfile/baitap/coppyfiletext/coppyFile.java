package bai14.textfile.baitap.coppyfiletext;

import java.io.*;
import java.util.Scanner;

public class coppyFile {
    static final String PATH = "src\\bai14\\textfile\\baitap\\coppyfiletext";

    public static void coppyFile(String newfile, String filePath) {
        //    Tạo đối tượng File trỏ tới đường dẫn
        File dir = new File(PATH);
        //Tạo thư mục nếu đường dẫn không tồn tại
        dir.mkdir();
        //Tạo đối tượng File trỏ tới đường dẫn
        File file = new File(PATH, newfile);
        try {
            //Tạo file
            if (file.createNewFile()) {
                System.out.println("File created..");
            } else {
                System.out.println("File already exists..");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
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
        coppyFile copyFileText = new coppyFile();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập đường dẫn file để copy: ");
        String fileCopy = scanner.nextLine();
        System.out.println("Nhập tên file mới: ");
        String File = scanner.nextLine();
        copyFileText.coppyFile(File, fileCopy);

    }
}
