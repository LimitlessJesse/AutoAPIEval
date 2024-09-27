import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.KeyGenerator;
import java.security.Key;
import java.io.IOException;

public class CipherInputStream_2 {
    public static void main(String[] args) {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(128); // for example
            Key key = keyGenerator.generateKey();

            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, key);

            CipherInputStream cipherInputStream = new CipherInputStream(System.in, cipher);

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = cipherInputStream.read(buffer))!= -1) {
                // process the bytes read
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
