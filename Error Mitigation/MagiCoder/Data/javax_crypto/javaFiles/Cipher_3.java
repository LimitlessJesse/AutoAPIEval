import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import java.security.AlgorithmParameters;
import java.security.Key;
import java.security.SecureRandom;

public class Cipher_3 {
    public static void main(String[] args) throws Exception {
        // Generate a secret key
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(128); // block size is 128 bits
        SecretKey secretKey = keyGenerator.generateKey();

        // Generate an initialization vector
        byte[] iv = new byte[16];
        new SecureRandom().nextBytes(iv);
        AlgorithmParameters params = AlgorithmParameters.getInstance("AES");
        params.init(new IvParameterSpec(iv));

        // Initialize the cipher
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey, params);

        // Now you can use the cipher for encryption and decryption
    }
}
