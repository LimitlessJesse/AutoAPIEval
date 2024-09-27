import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class Mac_1 {
    public static void main(String[] args) {
        try {
            // Create a secret key
            String key = "ThisIsASecretKey";
            SecretKeySpec secretKey = new SecretKeySpec(key.getBytes(), "HmacSHA256");

            // Get an instance of the HmacSHA256 Mac
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(secretKey);

            // Compute the HMAC-SHA256 of a message
            String message = "This is a message";
            byte[] bytes = mac.doFinal(message.getBytes());

            // Print the HMAC-SHA256
            StringBuilder sb = new StringBuilder(bytes.length * 2);
            for(byte b : bytes) {
                sb.append(String.format("%02x", b & 0xff));
            }
            System.out.println(sb.toString());

        } catch (NoSuchAlgorithmException | InvalidKeyException e) {
            e.printStackTrace();
        }
    }
}
