import java.security.Signature;
import java.security.PublicKey;
import java.security.InvalidKeyException;

public class Signature_1 {
    public static void main(String[] args) {
        try {
            Signature signature = Signature.getInstance("SHA1withRSA");
            PublicKey publicKey =...; // replace with your public key
            signature.initVerify(publicKey);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
