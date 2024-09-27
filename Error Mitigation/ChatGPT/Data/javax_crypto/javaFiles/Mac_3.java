import javax.crypto.Mac;
import javax.crypto.KeyGenerator;
import java.security.Key;
import java.security.NoSuchAlgorithmException;

public class Mac_3 {
    public static void main(String[] args) {
        try {
            KeyGenerator keyGen = KeyGenerator.getInstance("HmacSHA256");
            Key key = keyGen.generateKey();

            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(key);

            // Perform some operations with the Mac object

            mac.reset(); // Reset the Mac object

            // Mac object is now reset and can be used to generate another MAC
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
