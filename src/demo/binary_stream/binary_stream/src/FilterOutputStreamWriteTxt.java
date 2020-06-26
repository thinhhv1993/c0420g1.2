import java.io.*;

public class FilterOutputStreamWriteTxt {

    private static final String PATH = "src/test.txt";

    public static void main(String[] args) {
        FileOutputStream file = null;
        FilterOutputStream filter = null;
        try{
            file = new FileOutputStream(new File(PATH));
            filter = new FilterOutputStream(file);
            int s = 65;
//            byte b[] = s.getBytes();
            filter.write(s);
            filter.flush();
            System.out.println("Success...");
            filter.close();
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
