import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class Mac_4 {
    public static void main(String[] args) {
        try {
            // Create a new HMAC-SHA256 key
            byte[] keyBytes = "mySecretKey".getBytes();
            SecretKeySpec keySpec = new SecretKeySpec(keyBytes, "HmacSHA256");

            // Create a new HMAC-SHA256 Mac instance
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(keySpec);

            // Update the Mac with some data
            byte[] input = "Hello, World!".getBytes();
            mac.update(input, 0, input.length);

            // Calculate the HMAC
            byte[] hmac = mac.doFinal();

            // Print the HMAC
            System.out.println(new String(hmac));
        } catch (NoSuchAlgorithmException | InvalidKeyException e) {
            e.printStackTrace();
        }
    }
}
