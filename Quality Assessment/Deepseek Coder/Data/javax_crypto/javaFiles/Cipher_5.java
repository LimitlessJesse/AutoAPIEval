import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;

public class Cipher_5 {
    public static void main(String[] args) {
        try {
            // Create a key generator for AES
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(128); // for example
            SecretKey secretKey = keyGenerator.generateKey();

            // Create a cipher instance
            Cipher cipher = Cipher.getInstance("AES");

            // Initialize the cipher for encryption
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);

            // The input data
            byte[] input = "Hello, World!".getBytes();

            // Encrypt the input data
            byte[] encrypted = cipher.doFinal(input);

            // Print the encrypted data
            System.out.println("Encrypted: " + new String(encrypted));

            // Initialize the cipher for decryption
            cipher.init(Cipher.DECRYPT_MODE, secretKey);

            // Decrypt the encrypted data
            byte[] decrypted = cipher.doFinal(encrypted);

            // Print the decrypted data
            System.out.println("Decrypted: " + new String(decrypted));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
