package bai14.textfile.baitap.docfilecsv;

import java.io.*;

import java.util.Scanner;

public class cFile {
    static final String PATH = "src\\bai14\\textfile\\baitap\\docfilecsv";
    public static void creatfile(){
    // Tạo đối tượng File trỏ tới đường dẫn
        File dir = new File(PATH);
        //Tạo thư mục nếu đường dẫn không tồn tại
        dir.mkdir();
        //Tạo đối tượng File trỏ tới đường dẫn
        File file = new File(PATH,"country.csv");
        try {
            //Tạo file
            if (file.createNewFile()){
                System.out.println("File created..");
            }else {
                System.out.println("File already exists..");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeFile(String string){
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(PATH+"\\country.csv");
            fileWriter.write(String.valueOf(string));
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fileWriter != null){
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void showCountry(){
//        String csvFile = "src\\bai14\\textfile\\baitap\\docfilecsv\\country.csv";
        BufferedReader bufferedReader = null;
        String line = "";
        String cvsSplitBy = ",";

        try {
            bufferedReader = new BufferedReader(new FileReader(PATH+"\\country.csv"));
            while ((line = bufferedReader.readLine()) != null) {
                // use comma as separator
                String[] country = line.split(cvsSplitBy);
                System.out.println("Country [code= " + country[4] + " , name=" + country[5] + "]");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static void main(String[] args) {
        creatfile();
        System.out.println("Input text");
        Scanner scanner = new Scanner(System.in);
        String str = "";
        while (scanner.hasNextLine()) {
            String tempStr = scanner.nextLine();
            if (tempStr.isEmpty()) break;
            str += tempStr + "\n";
        }
        //        String string = "\"1.0.0.0\",\"1.0.0.255\",\"16777216\",\"16777471\",\"AU\",\"Australia\"\n" +
//                "\"1.0.1.0\",\"1.0.3.255\",\"16777472\",\"16778239\",\"CN\",\"China\"\n" +
//                "\"1.0.4.0\",\"1.0.7.255\",\"16778240\",\"16779263\",\"AU\",\"Australia\"\n" +
//                "\"1.0.8.0\",\"1.0.15.255\",\"16779264\",\"16781311\",\"CN\",\"China\"\n" +
//                "\"1.0.16.0\",\"1.0.31.255\",\"16781312\",\"16785407\",\"JP\",\"Japan\"\n" +
//                "\"1.0.32.0\",\"1.0.63.255\",\"16785408\",\"16793599\",\"CN\",\"China\"\n" +
//                "\"1.0.64.0\",\"1.0.127.255\",\"16793600\",\"16809983\",\"JP\",\"Japan\"\n" +
//                "\"1.0.128.0\",\"1.0.255.255\",\"16809984\",\"16842751\",\"TH\",\"Thailand\"";
        writeFile(str);
        showCountry();
        //    Liệt kê nội dung thư mục
//        if (dir.isDirectory()){
//            String[] dirContent = dir.list();
//            for (int i = 0; i < dirContent.length; i++ ){
//                System.out.println(dirContent[i]);
//            }
//        }
    }
}
