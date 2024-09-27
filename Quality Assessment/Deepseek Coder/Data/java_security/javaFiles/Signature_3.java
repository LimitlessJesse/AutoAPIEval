import java.security.Signature;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Signature_3 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        // Create a Signature object
        Signature signature = Signature.getInstance("SHA256withRSA");

        // Generate a message
        String message = "Hello, World!";
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] hash = md.digest(message.getBytes());

        // Generate a signature
        signature.initSign("YOUR_PRIVATE_KEY");
        signature.update(hash);
        byte[] signatureBytes = signature.sign();

        // Verify the signature
        signature.initVerify("YOUR_PUBLIC_KEY");
        signature.update(hash);
        boolean isValid = signature.verify(signatureBytes);

        // Print the result
        System.out.println("Signature is valid: " + isValid);
    }
}
