import java.io.IOException;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import java.io.OutputStream;

public class CipherOutputStream_5 {
    public static void main(String[] args) {
        try {
            Cipher cipher = Cipher.getInstance("AES");
            OutputStream outputStream = new OutputStream() {
                @Override
                public void write(int b) throws IOException {
                    // Implementation of write method
                }
            };
            CipherOutputStream cipherOutputStream = new CipherOutputStream(outputStream, cipher);
            cipherOutputStream.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
