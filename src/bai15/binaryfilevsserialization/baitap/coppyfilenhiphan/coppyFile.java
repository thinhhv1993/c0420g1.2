package bai15.binaryfilevsserialization.baitap.coppyfilenhiphan;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class coppyFile {
    public static void main(String[] args) {
        String sourceFile = "src\\bai15\\binaryfilevsserialization\\baitap\\coppyfilenhiphan\\input.dat";
        String destFile = "src\\bai15\\binaryfilevsserialization\\baitap\\coppyfilenhiphan\\output.dat";
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream(sourceFile);
            fos = new FileOutputStream(destFile);

            byte[] buffer = new byte[1024];
            int noOfBytes = 0;

            System.out.println("Copying file using streams");

            // read bytes from source file and write to destination file
            while ((noOfBytes = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, noOfBytes);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found" + e);
        }
        catch (IOException ioe) {
            System.out.println("Exception while copying file " + ioe);
        }
        finally {
            // close the streams using close method
            try {
                if (fis != null) {
                    fis.close();
                }
                if (fos != null) {
                    fos.close();
                }
            }
            catch (IOException ioe) {
                System.out.println("Error while closing stream: " + ioe);
            }
        }
    }
}
