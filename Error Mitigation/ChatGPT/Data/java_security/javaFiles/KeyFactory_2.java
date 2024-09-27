import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;

public class KeyFactory_2 {
    public static void main(String[] args) {
        try {
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            byte[] privateKeyBytes = { /* private key bytes */ };
            KeySpec keySpec = new PKCS8EncodedKeySpec(privateKeyBytes);
            PrivateKey privateKey = keyFactory.generatePrivate(keySpec);
            System.out.println("Private key generated: " + privateKey);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
