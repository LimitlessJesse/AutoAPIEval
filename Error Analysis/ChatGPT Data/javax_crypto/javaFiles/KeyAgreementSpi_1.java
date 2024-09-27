import javax.crypto.KeyAgreement;
import java.security.Key;
import java.security.SecureRandom;

public class KeyAgreementSpi_1 {
    public static void main(String[] args) {
        KeyAgreement keyAgreement = new KeyAgreementSpi();
        Key key = // initialize Key object
        SecureRandom random = // initialize SecureRandom object
        
        keyAgreement.engineInit(key, random);
    }
}
