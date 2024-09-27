import javax.crypto.KeyAgreement;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.Key;
import java.security.NoSuchAlgorithmException;

public class KeyAgreement_5 {
    public static void main(String[] args) {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("DiffieHellman");
            KeyPair keyPair = keyPairGenerator.generateKeyPair();

            KeyAgreement keyAgreement = KeyAgreement.getInstance("DiffieHellman");
            keyAgreement.init(keyPair.getPrivate());

            // Continue with key agreement process
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
