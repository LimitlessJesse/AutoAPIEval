import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import java.security.SecureRandom;

public class Cipher_4 {
    public static void main(String[] args) throws Exception {
        // Generate a key
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(128); // AES key size is 128 bits
        SecretKey key = keyGenerator.generateKey();

        // Generate an initialization vector
        byte[] iv = new byte[16];
        new SecureRandom().nextBytes(iv);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(iv);

        // Initialize the Cipher for encryption
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, key, ivParameterSpec);

        // Now you can use the cipher for encryption
        String plainText = "Hello, World!";
        byte[] cipherText = cipher.doFinal(plainText.getBytes());
        System.out.println(new String(cipherText));
    }
}
