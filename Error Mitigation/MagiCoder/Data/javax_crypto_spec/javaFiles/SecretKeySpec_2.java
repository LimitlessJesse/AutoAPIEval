import javax.crypto.spec.SecretKeySpec;
import java.security.Key;

public class SecretKeySpec_2 {
    public static void main(String[] args) {
        // Create a new SecretKeySpec
        Key key = new SecretKeySpec("mySecretKey".getBytes(), "AES");

        // Get the encoded key
        byte[] encodedKey = key.getEncoded();

        // Print the encoded key
        for (byte b : encodedKey) {
            System.out.print(b + " ");
        }
    }
}
