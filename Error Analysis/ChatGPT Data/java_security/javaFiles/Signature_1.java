import java.security.Signature;

public class Signature_1 {
    public static void main(String[] args) {
        try {
            Signature signature = Signature.getInstance("SHA256withRSA");
            byte[] data = "Hello, World!".getBytes();
            signature.update(data);
            byte[] signatureValue = signature.sign();
            System.out.println("Signature: " + new String(signatureValue));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
