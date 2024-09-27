import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

public class X509EncodedKeySpec_3 {
    public static void main(String[] args) {
        try {
            // Create a KeyFactory instance for X.509
            KeyFactory keyFactory = KeyFactory.getInstance("X.509");

            // Create a X509EncodedKeySpec instance
            X509EncodedKeySpec keySpec = new X509EncodedKeySpec(Base64.getDecoder().decode("Your X.509 encoded key here"));

            // Get the format
            String format = keySpec.getFormat();

            System.out.println("Format: " + format);
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            e.printStackTrace();
        }
    }
}
