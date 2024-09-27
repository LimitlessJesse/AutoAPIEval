import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class Mac_5 {
    public static void main(String[] args) {
        try {
            // Create a new HMAC-SHA256 key
            String key = "mySecretKey";
            SecretKeySpec secretKey = new SecretKeySpec(key.getBytes(), "HmacSHA256");

            // Create a new HMAC-SHA256 Mac instance
            Mac mac = Mac.getInstance("HmacSHA256");

            // Initialize the Mac with the secret key
            mac.init(secretKey);

            // The data to be hashed
            String data = "Hello, World!";

            // Compute the hash
            byte[] hash = mac.doFinal(data.getBytes());

            // Print the hash
            System.out.println(new String(hash));
        } catch (NoSuchAlgorithmException | InvalidKeyException e) {
            e.printStackTrace();
        }
    }
}
