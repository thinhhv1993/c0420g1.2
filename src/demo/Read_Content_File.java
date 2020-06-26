package demo;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

public class Read_Content_File {
    static final String PATH = "src/content/test.txt";

    public static void main(String[] args) {
        FileReader fileReader = null;
        BufferedReader bufferReader = null;
        try {
            fileReader = new FileReader(PATH);
            bufferReader = new BufferedReader(fileReader);
            StringBuffer result = new StringBuffer();
            String line = null;
            while ( (line = bufferReader.readLine()) != null){
                result.append(line);
            }
            System.out.println(result);
            bufferReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
