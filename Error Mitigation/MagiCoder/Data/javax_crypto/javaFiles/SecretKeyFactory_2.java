import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import java.security.spec.KeySpec;
import java.security.spec.InvalidKeySpecException;

public class SecretKeyFactory_2 {
    public static void main(String[] args) {
        try {
            // Create a secret key factory
            SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");

            // Create a key specification
            KeySpec spec = new PBEKeySpec("password".toCharArray(), "salt".getBytes(), 65536, 256);

            // Generate a secret key
            SecretKey secretKey = factory.generateSecret(spec);

            // Print the secret key
            System.out.println(secretKey);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
