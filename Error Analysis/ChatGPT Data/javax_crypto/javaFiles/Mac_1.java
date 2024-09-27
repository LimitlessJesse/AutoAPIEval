import javax.crypto.Mac;
import javax.crypto.KeyGenerator;
import java.security.Key;
import java.security.NoSuchAlgorithmException;

public class Mac_1 {
    public static void main(String[] args) {
        try {
            KeyGenerator keyGen = KeyGenerator.getInstance("HmacSHA256");
            Key key = keyGen.generateKey();
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(key);
        } catch (NoSuchAlgorithmException e) {
            System.out.println("Algorithm not found");
        }
    }
}
