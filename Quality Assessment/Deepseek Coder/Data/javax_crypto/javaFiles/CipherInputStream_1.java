import javax.crypto.CipherInputStream;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import java.security.Key;
import java.io.InputStream;
import java.io.IOException;

public class CipherInputStream_1 {
    public static void main(String[] args) {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(128); // for example
            Key key = keyGenerator.generateKey();

            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, key);

            InputStream input = new FileInputStream("input.txt");
            CipherInputStream cipherInputStream = new CipherInputStream(input, cipher);

            int data;
            while ((data = cipherInputStream.read())!= -1) {
                System.out.print((char) data);
            }

            cipherInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
