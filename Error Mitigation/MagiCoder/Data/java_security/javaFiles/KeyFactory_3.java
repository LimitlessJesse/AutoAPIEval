import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

public class KeyFactory_3 {
    public static void main(String[] args) {
        try {
            // Create a KeyFactory instance
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");

            // Create a private key specification
            String privateKeyStr = "..."; // replace with your private key
            byte[] privateKeyBytes = Base64.getDecoder().decode(privateKeyStr);
            KeySpec privateKeySpec = new PKCS8EncodedKeySpec(privateKeyBytes);

            // Generate a private key
            keyFactory.generatePrivate(privateKeySpec);

            // Create a public key specification
            String publicKeyStr = "..."; // replace with your public key
            byte[] publicKeyBytes = Base64.getDecoder().decode(publicKeyStr);
            KeySpec publicKeySpec = new X509EncodedKeySpec(publicKeyBytes);

            // Generate a public key
            keyFactory.generatePublic(publicKeySpec);
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            e.printStackTrace();
        }
    }
}
