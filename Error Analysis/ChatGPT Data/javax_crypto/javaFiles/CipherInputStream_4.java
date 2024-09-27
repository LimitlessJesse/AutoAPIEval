import javax.crypto.CipherInputStream;
import java.io.*;

public class CipherInputStream_4 {
    public static void main(String[] args) {
        try {
            File inputFile = new File("input.txt");
            FileInputStream fileInputStream = new FileInputStream(inputFile);
            CipherInputStream cipherInputStream = new CipherInputStream(fileInputStream, null);

            long bytesSkipped = cipherInputStream.skip(10);
            System.out.println("Number of bytes skipped: " + bytesSkipped);

            cipherInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
