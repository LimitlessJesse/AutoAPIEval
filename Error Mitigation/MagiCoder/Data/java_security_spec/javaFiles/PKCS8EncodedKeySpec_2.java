import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.spec.PKCS8EncodedKeySpec;

public class PKCS8EncodedKeySpec_2 {
    public static void main(String[] args) {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(2048);
            KeyPair keyPair = keyPairGenerator.generateKeyPair();

            PKCS8EncodedKeySpec pkcs8EncodedKeySpec = new PKCS8EncodedKeySpec(keyPair.getPrivate().getEncoded());
            byte[] encodedKey = pkcs8EncodedKeySpec.getEncoded();

            System.out.println(new String(encodedKey));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
