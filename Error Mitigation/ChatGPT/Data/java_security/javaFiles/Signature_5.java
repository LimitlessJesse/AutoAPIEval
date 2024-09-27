import java.security.Signature;
import java.security.SignatureException;

public class Signature_5 {
    public static void main(String[] args) {
        try {
            Signature signature = Signature.getInstance("SHA256withRSA");
            byte[] signatureBytes = {1, 2, 3, 4}; // Example signature bytes
            boolean isVerified = signature.verify(signatureBytes);
            System.out.println("Signature verified: " + isVerified);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
