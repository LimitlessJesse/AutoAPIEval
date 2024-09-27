import javax.crypto.KeyAgreement;
import java.security.NoSuchAlgorithmException;

public class KeyAgreement_3 {
    public static void main(String[] args) {
        try {
            KeyAgreement keyAgreement = KeyAgreement.getInstance("DiffieHellman");
            String algorithm = keyAgreement.getAlgorithm();
            System.out.println("Key agreement algorithm: " + algorithm);
        } catch (NoSuchAlgorithmException e) {
            System.out.println("Algorithm not found: " + e.getMessage());
        }
    }
}
