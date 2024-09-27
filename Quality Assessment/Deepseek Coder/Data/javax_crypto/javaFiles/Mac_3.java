import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class Mac_3 {
    public static void main(String[] args) {
        try {
            // Create a new HMAC-SHA256 key
            byte[] keyBytes = "mySecretKey".getBytes();
            SecretKeySpec keySpec = new SecretKeySpec(keyBytes, "HmacSHA256");

            // Create a new HMAC-SHA256 Mac instance
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(keySpec);

            // Update the Mac with some data
            byte[] data = "Hello, World!".getBytes();
            for (byte b : data) {
                mac.update(b);
            }

            // Get the HMAC as a byte array
            byte[] hmac = mac.doFinal();

            // Print the HMAC as a hexadecimal string
            StringBuilder sb = new StringBuilder(hmac.length * 2);
            for (byte b : hmac) {
                sb.append(String.format("%02x", b & 0xff));
            }
            System.out.println(sb.toString());

        } catch (NoSuchAlgorithmException | InvalidKeyException e) {
            e.printStackTrace();
        }
    }
}
