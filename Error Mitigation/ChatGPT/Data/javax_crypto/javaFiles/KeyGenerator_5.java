import javax.crypto.KeyGenerator;
import javax.crypto.spec.SecretKeySpec;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class KeyGenerator_5 {
    public static void main(String[] args) {
        try {
            KeyGenerator keyGen = KeyGenerator.getInstance("AES");
            SecureRandom random = new SecureRandom();
            keyGen.init(new SecretKeySpec("key".getBytes(), "AES").getEncoded(), random);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
