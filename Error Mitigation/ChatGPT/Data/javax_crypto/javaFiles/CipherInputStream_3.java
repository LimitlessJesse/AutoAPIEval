import javax.crypto.CipherInputStream;
import java.io.IOException;

public class CipherInputStream_3 {
    public static void main(String[] args) {
        try {
            CipherInputStream cipherInputStream = new CipherInputStream(System.in, null);
            byte[] buffer = new byte[1024];
            int bytesRead = cipherInputStream.read(buffer, 0, buffer.length);
            System.out.println("Total bytes read: " + bytesRead);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
