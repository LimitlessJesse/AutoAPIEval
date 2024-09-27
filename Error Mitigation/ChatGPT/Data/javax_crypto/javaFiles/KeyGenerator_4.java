import javax.crypto.KeyGenerator;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class KeyGenerator_4 {
    public static void main(String[] args) {
        try {
            KeyGenerator keyGen = KeyGenerator.getInstance("AES");
            SecureRandom random = SecureRandom.getInstanceStrong();
            keyGen.init(new SecretKeySpec(random.generateSeed(16), "AES"));
        } catch (NoSuchAlgorithmException | InvalidAlgorithmParameterException e) {
            e.printStackTrace();
        }
    }
}
