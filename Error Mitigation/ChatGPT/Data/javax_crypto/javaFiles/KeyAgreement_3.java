import javax.crypto.KeyAgreement;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;

public class KeyAgreement_3 {
    public static void main(String[] args) {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("DiffieHellman");
            KeyPair keyPair = keyPairGenerator.generateKeyPair();

            KeyAgreement keyAgreement = KeyAgreement.getInstance("DiffieHellman");
            keyAgreement.init(keyPair.getPrivate());
            keyAgreement.doPhase(keyPair.getPublic(), true);

            byte[] sharedSecret = keyAgreement.generateSecret();
            System.out.println("Shared Secret: " + new String(sharedSecret));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
