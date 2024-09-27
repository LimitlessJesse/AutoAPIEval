import java.io.IOException;
import java.io.OutputStream;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;

public class CipherOutputStream_2 {
    public static void main(String[] args) {
        try {
            // Create a new CipherOutputStream
            OutputStream outputStream = new OutputStream() {
                @Override
                public void write(int b) throws IOException {
                    // Implement the write method
                    System.out.write(b);
                }
            };

            Cipher cipher = Cipher.getInstance("AES");
            CipherOutputStream cipherOutputStream = new CipherOutputStream(outputStream, cipher);

            // Write a byte to the CipherOutputStream
            cipherOutputStream.write(65); // 'A'
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
