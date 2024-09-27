import java.security.KeyFactory;
import java.security.spec.X509EncodedKeySpec;
import java.security.PublicKey;
import java.util.Base64;

public class KeyFactory_1 {
    public static void main(String[] args) throws Exception {
        byte[] publicKeyBytes = Base64.getDecoder().decode("YOUR_PUBLIC_KEY_HERE");

        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        X509EncodedKeySpec keySpec = new X509EncodedKeySpec(publicKeyBytes);
        
        PublicKey publicKey = keyFactory.generatePublic(keySpec);
        System.out.println("Public Key: " + publicKey);
    }
}
