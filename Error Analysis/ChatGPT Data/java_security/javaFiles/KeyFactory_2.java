import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;

public class KeyFactory_2 {
    public static void main(String[] args) {
        try {
            byte[] privateKeyBytes = new byte[] { /* Add your private key bytes here */ };
            PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(privateKeyBytes);
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            PrivateKey privateKey = keyFactory.generatePrivate(keySpec);

            System.out.println("Private Key: " + privateKey);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
