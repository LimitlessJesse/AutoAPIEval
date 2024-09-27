import java.io.IOException;
import java.io.InputStream;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;

public class CipherInputStream_5 {
    public static void main(String[] args) {
        try {
            InputStream inputStream = new InputStream() {
                @Override
                public int read() throws IOException {
                    return 0;
                }
            };
            Cipher cipher = Cipher.getInstance("AES");
            CipherInputStream cipherInputStream = new CipherInputStream(inputStream, cipher);
            cipherInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
