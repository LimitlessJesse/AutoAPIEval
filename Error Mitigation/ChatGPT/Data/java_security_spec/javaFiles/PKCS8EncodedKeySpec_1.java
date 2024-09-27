import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Arrays;

public class PKCS8EncodedKeySpec_1 {
    public static void main(String[] args) {
        byte[] keyBytes = {1, 2, 3, 4, 5}; // Sample key bytes
        PKCS8EncodedKeySpec pkcs8EncodedKeySpec = new PKCS8EncodedKeySpec(keyBytes);
        
        byte[] encodedKey = pkcs8EncodedKeySpec.getEncoded();
        System.out.println("Encoded key: " + Arrays.toString(encodedKey));
    }
}
