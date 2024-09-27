import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.KeyGenerator;
import java.security.Key;
import java.io.IOException;

public class CipherInputStream_3 {
    public static void main(String[] args) {
        try {
            // Generate a key
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(128); // AES-128
            Key key = keyGenerator.generateKey();

            // Create a cipher
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, key);

            // Create a cipher input stream
            CipherInputStream cipherInputStream = new CipherInputStream(System.in, cipher);

            // Read from the cipher input stream
            byte[] buffer = new byte[1024];
            int bytesRead = cipherInputStream.read(buffer, 0, buffer.length);
            while (bytesRead!= -1) {
                System.out.write(buffer, 0, bytesRead);
                bytesRead = cipherInputStream.read(buffer, 0, buffer.length);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
