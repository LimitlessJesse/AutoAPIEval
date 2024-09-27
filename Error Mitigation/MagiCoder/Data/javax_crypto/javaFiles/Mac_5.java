import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class Mac_5 {
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

            // Get the MAC value
            byte[] macValue = mac.doFinal();

            // Print the MAC value
            System.out.println("MAC value: " + new String(macValue));

            // Reset the Mac object
            mac.reset();

            // Update the Mac object with some other data
            mac.update("Hello, Universe!".getBytes());

            // Get the MAC value again
            macValue = mac.doFinal();

            // Print the MAC value again
            System.out.println("MAC value: " + new String(macValue));
        } catch (NoSuchAlgorithmException | InvalidKeyException e) {
            e.printStackTrace();
        }
    }
}
