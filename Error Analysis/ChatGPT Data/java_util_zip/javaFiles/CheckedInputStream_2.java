import java.io.*;
import java.util.zip.CheckedInputStream;

public class CheckedInputStream_2 {
    public static void main(String[] args) {
        try {
            FileInputStream fis= new FileInputStream("example.txt");
            CheckedInputStream cis = new CheckedInputStream(fis, new CRC32());
            byte[] buffer = new byte[1024];
            int bytesRead = 0;
            while ((bytesRead = cis.read(buffer, 0, buffer.length)) != -1) {
                System.out.println("Read " + bytesRead + " bytes");
            }
            cis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
