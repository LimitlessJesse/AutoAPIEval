import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.spec.EncodedKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

public class EncodedKeySpec_3 {
    public static void main(String[] args) {
        try {
            KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
            keyGen.initialize(2048);
            KeyPair pair = keyGen.generateKeyPair();

            byte[] publicKeyBytes = pair.getPublic().getEncoded();
            byte[] privateKeyBytes = pair.getPrivate().getEncoded();

            EncodedKeySpec publicKeySpec = new X509EncodedKeySpec(publicKeyBytes);
            EncodedKeySpec privateKeySpec = new X509EncodedKeySpec(privateKeyBytes);

            System.out.println("Public Key Format: " + publicKeySpec.getFormat());
            System.out.println("Private Key Format: " + privateKeySpec.getFormat());

        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            e.printStackTrace();
        }
    }
}
