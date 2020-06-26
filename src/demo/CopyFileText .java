package demo;

import java.io.*;
import java.util.Scanner;

class CopyFileText {
    static final String PATH = "src/text_file/bai_tap";
    public void copyFile(String newfile, String filePath) {
        File file = new File(PATH);
        file.mkdir();
        File file1 = new File(PATH, newfile);
        try {
            if (file1.createNewFile()) {
                System.out.println("File created..");
            } else
                System.out.println("File already exists..");
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
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        FileWriter fileWriter=null;
        try {
            fileWriter=new FileWriter(file1);
            fileWriter.write(String.valueOf(str));
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        CopyFileText copyFileText = new CopyFileText();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập đường dẫn file để copy: ");
        String fileCopy = scanner.nextLine();
        System.out.println("Nhập tên file mới: ");
        String File = scanner.nextLine();
        copyFileText.copyFile(File, fileCopy);
    }
}
