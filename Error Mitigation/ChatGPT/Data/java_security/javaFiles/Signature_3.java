import java.security.Signature;
import java.security.SignatureException;

public class Signature_3 {
    public static void main(String[] args) {
        try {
            Signature signature = Signature.getInstance("SHA256withRSA");
            byte[] data = "Hello, World!".getBytes();
            signature.update(data);
        } catch (SignatureException e) {
            e.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
