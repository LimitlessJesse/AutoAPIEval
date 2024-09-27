import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class Cipher_1 {
    public static void main(String[] args) throws Exception {
        // Generate a secret key
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        SecureRandom secureRandom = new SecureRandom();
        keyGenerator.init(secureRandom);
        SecretKey secretKey = keyGenerator.generateKey();

        // Create a cipher instance
        Cipher cipher = Cipher.getInstance("AES");

        // Initialize the cipher for encryption
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);

        // Input data
        String input = "Hello, World!";
        byte[] inputBytes = input.getBytes();

        // Encrypt the data
        byte[] encryptedBytes = cipher.doFinal(inputBytes);

        // Initialize the cipher for decryption
        cipher.init(Cipher.DECRYPT_MODE, secretKey);

        // Decrypt the data
        byte[] decryptedBytes = cipher.doFinal(encryptedBytes);

        // Print the decrypted data
        System.out.println(new String(decryptedBytes));
    }
}
