import javax.crypto.CipherOutputStream;
import java.io.IOException;

public class CipherOutputStream_2 {
    public static void main(String[] args) {
        try {
            CipherOutputStream cipherOutputStream = new CipherOutputStream(System.out);
            byte[] data = "Hello, World!".getBytes();
            cipherOutputStream.write(data);
            cipherOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
