import javax.crypto.KeyAgreement;
import java.security.Provider;

public class KeyAgreement_4 {
    public static void main(String[] args) {
        try {
            KeyAgreement keyAgreement = KeyAgreement.getInstance("DiffieHellman");
            Provider provider = keyAgreement.getProvider();
            System.out.println("Provider: " + provider.getName());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
