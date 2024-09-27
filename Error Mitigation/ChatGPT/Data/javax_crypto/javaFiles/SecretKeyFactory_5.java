import javax.crypto.SecretKeyFactory;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import java.security.spec.KeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

public class SecretKeyFactory_5 {
    public static void main(String[] args) {
        try {
            SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
            char[] password = "password".toCharArray();
            byte[] salt = new byte[] {1, 2, 3, 4, 5, 6, 7, 8};
            int iterations = 1000;
            int keyLength = 256;

            KeySpec keySpec = new PBEKeySpec(password, salt, iterations, keyLength);
            SecretKey secretKey = factory.generateSecret(keySpec);

            System.out.println("Generated Secret Key: " + secretKey);
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            e.printStackTrace();
        }
    }
}
