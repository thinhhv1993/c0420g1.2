import java.io.*;

public class FilterInputStreamReadTxt {
    private static final String PATH = "src/test.txt";

    public static void main(String[] args) {
        try {
            FileInputStream inputStream = new FileInputStream(new File(PATH));
            FilterInputStream filter = new BufferedInputStream(inputStream);
            int k = 0;
            while ((k = filter.read()) != -1) {
                System.out.print((char) k);
                System.out.print(k);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
