import java.security.Signature;
import java.security.PrivateKey;
import java.security.SignatureException;

public class Signature_4 {
    public static void main(String[] args) {
        try {
            Signature signature = Signature.getInstance("SHA256withRSA");
            PrivateKey privateKey = // initialize private key
            signature.initSign(privateKey);
            byte[] data = // initialize data
            signature.update(data);
            byte[] signatureBytes = signature.sign();
            System.out.println("Signature: " + new String(signatureBytes));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
