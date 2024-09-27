import javax.crypto.spec.DESedeKeySpec;
import javax.crypto.SecretKey;
import javax.crypto.KeyGenerator;
import java.security.spec.KeySpec;
import java.security.InvalidKeyException;
import java.security.spec.InvalidKeySpecException;

public class DESedeKeySpec_2 {
    public static void main(String[] args) {
        try {
            // Generate a DESede key
            KeyGenerator generator = KeyGenerator.getInstance("DESede");
            generator.init(168); // for example, 168-bit key length
            SecretKey key = generator.generateKey();

            // Get the key specification
            KeySpec spec = new DESedeKeySpec(key.getEncoded());

            // Get the key bytes
            byte[] keyBytes = spec.getKey();

            // Print the key bytes
            for (byte b : keyBytes) {
                System.out.print(b + " ");
            }
        } catch (InvalidKeyException | InvalidKeySpecException | java.security.NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
