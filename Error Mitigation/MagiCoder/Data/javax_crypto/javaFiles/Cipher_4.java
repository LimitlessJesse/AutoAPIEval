import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.security.SecureRandom;

public class Cipher_4 {
    public static void main(String[] args) throws Exception {
        // Generate a secret key
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(128);
        SecretKey secretKey = keyGenerator.generateKey();

        // Create a cipher
        Cipher cipher = Cipher.getInstance("AES");

        // Initialize the cipher for encryption
        cipher.init(Cipher.ENCRYPT_MODE, secretKey, new SecureRandom());

        // Now you can use the cipher for encryption and decryption
    }
}
