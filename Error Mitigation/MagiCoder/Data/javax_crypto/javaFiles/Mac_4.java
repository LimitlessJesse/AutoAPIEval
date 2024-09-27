import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class Mac_4 {
    public static void main(String[] args) {
        try {
            // Create a new Mac object
            Mac mac = Mac.getInstance("HmacSHA256");

            // Create a secret key
            SecretKeySpec secretKey = new SecretKeySpec("mySecretKey".getBytes(), "HmacSHA256");

            // Initialize the Mac object with the secret key
            mac.init(secretKey);

            // Update the Mac object with some data
            mac.update("Hello, World!".getBytes());

            // Finish the MAC operation and get the result
            byte[] result = mac.doFinal();

            // Print the result
            System.out.println("MAC result: " + new String(result));
        } catch (NoSuchAlgorithmException | InvalidKeyException e) {
            e.printStackTrace();
        }
    }
}
