import javax.crypto.CipherInputStream;
import java.io.IOException;

public class CipherInputStream_2 {
    public static void main(String[] args) {
        try {
            CipherInputStream cipherInputStream = new CipherInputStream(System.in, null);
            byte[] buffer = new byte[1024];
            int bytesRead = cipherInputStream.read(buffer);
            System.out.println("Total number of bytes read into the buffer: " + bytesRead);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
