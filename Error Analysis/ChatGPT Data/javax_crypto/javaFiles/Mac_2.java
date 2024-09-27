import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class Mac_2 {
    public static void main(String[] args) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            byte[] key = "secretkey".getBytes(); // Example key, replace with your own
            SecretKeySpec secretKey = new SecretKeySpec(key, "HmacSHA256");
            mac.init(secretKey);

            byte[] input = "Hello World".getBytes(); // Example input
            mac.update(input);

            byte[] result = mac.doFinal();
            System.out.println("MAC result: " + javax.xml.bind.DatatypeConverter.printHexBinary(result));
        } catch (NoSuchAlgorithmException | InvalidKeyException e) {
            e.printStackTrace();
        }
    }
}
