import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.Key;

public class Mac_1 {
    public static void main(String[] args) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            Key key = new SecretKeySpec("secretKey".getBytes(), "HmacSHA256");
            mac.init(key);
            System.out.println("Mac object initialized successfully with the key.");
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            System.out.println("Invalid key or algorithm specified.");
        }
    }
}
