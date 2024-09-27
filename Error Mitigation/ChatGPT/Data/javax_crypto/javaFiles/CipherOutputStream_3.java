import javax.crypto.CipherOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class CipherOutputStream_3 {
    public static void main(String[] args) {
        try {
            CipherOutputStream cipherOutputStream = new CipherOutputStream(new ByteArrayOutputStream(), null);
            byte[] data = "Hello, World!".getBytes();
            int offset = 0;
            int length = data.length;
            cipherOutputStream.write(data, offset, length);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
