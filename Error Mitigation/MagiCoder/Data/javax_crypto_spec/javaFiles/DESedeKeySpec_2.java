import javax.crypto.spec.DESedeKeySpec;
import java.security.Key;
import java.security.SecureRandom;

public class DESedeKeySpec_2 {
    public static void main(String[] args) {
        try {
            // Generate a new DESede key
            SecureRandom sr = new SecureRandom();
            byte[] keyBytes = new byte[24];
            sr.nextBytes(keyBytes);

            // Create a DESede key specification
            DESedeKeySpec keySpec = new DESedeKeySpec(keyBytes);

            // Get the key
            Key key = keySpec.getKey();

            // Print the key
            System.out.println("Key: " + new String(key.getEncoded()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
