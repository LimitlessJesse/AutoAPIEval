import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import java.security.Key;
import java.security.SecureRandom;

public class Cipher_1 {
    public static void main(String[] args) {
        try {
            // Generate a random key
            KeyGenerator keyGen = KeyGenerator.getInstance("AES");
            keyGen.init(128, new SecureRandom());
            Key key = keyGen.generateKey();
            
            // Create a cipher object
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, key);
            
            // Input data
            byte[] input = "Hello, World!".getBytes();
            
            // Encrypt the input data
            byte[] encrypted = cipher.doFinal(input);
            
            // Output the encrypted data
            System.out.println("Encrypted data: " + new String(encrypted));
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
