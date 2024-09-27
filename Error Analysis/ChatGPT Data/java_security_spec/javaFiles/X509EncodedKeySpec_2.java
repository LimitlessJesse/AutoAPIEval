import java.security.spec.X509EncodedKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.NoSuchAlgorithmException;

public class X509EncodedKeySpec_2 {
    public static void main(String[] args) {
        byte[] keyBytes = { 0x00, 0x01, 0x02, 0x03 }; // Sample key bytes

        X509EncodedKeySpec keySpec = new X509EncodedKeySpec(keyBytes);

        try {
            String format = keySpec.getFormat();
            System.out.println("Key format: " + format);
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            e.printStackTrace();
        }
    }
}
