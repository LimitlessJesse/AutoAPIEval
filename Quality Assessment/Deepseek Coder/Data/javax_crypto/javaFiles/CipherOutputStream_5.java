import javax.crypto.CipherOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import javax.crypto.Cipher;

public class CipherOutputStream_5 {
    public static void main(String[] args) {
        try {
            OutputStream outputStream = new OutputStream() {
                @Override
                public void write(int b) throws IOException {
                    // Implement your logic here
                }
            };

            Cipher cipher = Cipher.getInstance("AES");
            CipherOutputStream cipherOutputStream = new CipherOutputStream(outputStream, cipher);

            cipherOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
