import java.security.Signature;
import java.security.SignatureException;

public class Signature_3 {
    public static void main(String[] args) {
        try {
            Signature signature = Signature.getInstance("SHA1withRSA");
            signature.update("Hello, World!".getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
