import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class Mac_3 {
    public static void main(String[] args) {
        try {
            // Create a new Mac instance
            Mac mac = Mac.getInstance("HmacSHA256");

            // Create a new SecretKeySpec instance
            SecretKeySpec secretKeySpec = new SecretKeySpec("secretKey".getBytes(), "HmacSHA256");

            // Initialize the Mac instance with the SecretKeySpec instance
            mac.init(secretKeySpec);

            // Update the Mac instance with some data
            mac.update("data".getBytes());

            // Get the Mac's output
            byte[] output = mac.doFinal();

            // Print the output
            System.out.println(new String(output));
        } catch (NoSuchAlgorithmException | InvalidKeyException e) {
            e.printStackTrace();
        }
    }
}
