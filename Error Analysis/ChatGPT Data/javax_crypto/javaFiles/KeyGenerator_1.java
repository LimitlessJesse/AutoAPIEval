import javax.crypto.KeyGenerator;
import java.security.NoSuchAlgorithmException;

public class KeyGenerator_1 {
    public static void main(String[] args) {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            System.out.println("KeyGenerator algorithm: " + keyGenerator.getAlgorithm());
        } catch (NoSuchAlgorithmException e) {
            System.out.println("Algorithm not found: " + e.getMessage());
        }
    }
}
