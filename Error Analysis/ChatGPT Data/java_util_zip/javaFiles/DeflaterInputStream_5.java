import java.io.*;
import java.util.zip.DeflaterInputStream;

public class DeflaterInputStream_5 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("input.txt");
             DeflaterInputStream dis = new DeflaterInputStream(fis);) {

            long skipped = dis.skip(10);
            System.out.println("Number of bytes skipped: " + skipped);

            byte[] buffer = new byte[1024];
            int bytesRead = dis.read(buffer);
            System.out.println("Number of bytes read: " + bytesRead);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
