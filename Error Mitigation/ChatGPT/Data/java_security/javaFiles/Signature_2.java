import java.security.InvalidKeyException;
import java.security.PublicKey;
import java.security.Signature;

public class Signature_2 {
    public static void main(String[] args) {
        try {
            Signature signature = Signature.getInstance("SHA256withRSA");
            PublicKey publicKey = // initialize your public key here
            signature.initVerify(publicKey);
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
