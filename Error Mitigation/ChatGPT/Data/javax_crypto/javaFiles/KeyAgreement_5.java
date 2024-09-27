import javax.crypto.KeyAgreement;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyFactory;
import java.security.Key;
import java.security.InvalidKeyException;

public class KeyAgreement_5 {
    public static void main(String[] args) {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("DiffieHellman");
            KeyPair keyPair = keyPairGenerator.generateKeyPair();

            KeyAgreement keyAgreement = KeyAgreement.getInstance("DiffieHellman");
            keyAgreement.init(keyPair.getPrivate());

            KeyPair otherKeyPair = keyPairGenerator.generateKeyPair();
            Key otherPublicKey = otherKeyPair.getPublic();

            keyAgreement.doPhase(otherPublicKey, true);

            SecretKey sharedSecretKey = keyAgreement.generateSecret("AES");
            byte[] sharedSecretKeyBytes = sharedSecretKey.getEncoded();

            SecretKey reconstructedKey = new SecretKeySpec(sharedSecretKeyBytes, 0, sharedSecretKeyBytes.length, "AES");

            System.out.println("Shared secret key: " + reconstructedKey);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
