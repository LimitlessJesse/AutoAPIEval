import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.Signature;

public class Signature_1 {
    public static void main(String[] args) {
        try {
            Signature signature = Signature.getInstance("SHA256withRSA");
            PrivateKey privateKey = // initialize private key here
            signature.initSign(privateKey);
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
