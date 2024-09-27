import javax.crypto.KeyAgreement;
import java.security.Key;
import java.security.InvalidKeyException;

public class KeyAgreement_1 {
    public static void main(String[] args) {
        try {
            KeyAgreement keyAgreement = KeyAgreement.getInstance("DiffieHellman");
            Key privateKey = // initialize the private key here
            keyAgreement.init(privateKey);
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
