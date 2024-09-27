import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class Mac_4 {
    public static void main(String[] args) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            byte[] keyBytes = "secretkey".getBytes();
            SecretKeySpec key = new SecretKeySpec(keyBytes, "HmacSHA256");
            mac.init(key);
            
            byte[] data = "Hello, World!".getBytes();
            mac.update(data);
            
            byte[] macResult = mac.doFinal();
            
            System.out.println("MAC result: " + new String(macResult));
        } catch (NoSuchAlgorithmException | InvalidKeyException e) {
            e.printStackTrace();
        }
    }
}
