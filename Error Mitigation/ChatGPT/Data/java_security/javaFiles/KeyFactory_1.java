import java.security.KeyFactory;
import java.security.spec.X509EncodedKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.PublicKey;

public class KeyFactory_1 {
    public static void main(String[] args) {
        try {
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            byte[] publicKeyBytes = { /* Public key bytes here */ };
            X509EncodedKeySpec keySpec = new X509EncodedKeySpec(publicKeyBytes);
            PublicKey publicKey = keyFactory.generatePublic(keySpec);
            System.out.println("Generated public key: " + publicKey);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
