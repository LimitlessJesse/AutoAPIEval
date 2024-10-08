import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class Mac_2 {
    public static void main(String[] args) {
        try {
            // Create a new HMAC-SHA256 key
            String key = "ThisIsAKey";
            SecretKeySpec secretKey = new SecretKeySpec(key.getBytes(), "HmacSHA256");

            // Create a new HMAC-SHA256 Mac instance
            Mac mac = Mac.getInstance("HmacSHA256");

            // Initialize the Mac with the key
            mac.init(secretKey);

            // Generate a HMAC-SHA256 hash
            byte[] hash = mac.doFinal("ThisIsSomeData".getBytes());

            // Print the hash
            System.out.println(new String(hash));
        } catch (NoSuchAlgorithmException | InvalidKeyException e) {
            e.printStackTrace();
        }
    }
}
