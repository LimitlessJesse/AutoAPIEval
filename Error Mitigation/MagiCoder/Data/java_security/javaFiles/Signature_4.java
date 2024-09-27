import java.security.Signature;
import java.security.SignatureException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

public class Signature_4 {
    public static void main(String[] args) {
        try {
            // Generate a key pair
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(2048);
            KeyPair keyPair = keyPairGenerator.generateKeyPair();

            // Create a Signature object and initialize it with the public key
            Signature signature = Signature.getInstance("SHA256withRSA");
            signature.initVerify(keyPair.getPublic());

            // Update the signature with some data
            signature.update("Hello, World!".getBytes());

            // Generate a signature
            byte[] signatureBytes = signature.sign();

            // Now, verify the signature
            signature.initVerify(keyPair.getPublic());
            signature.update("Hello, World!".getBytes());

            boolean isValid = signature.verify(signatureBytes);

            System.out.println("Signature is valid: " + isValid);
        } catch (NoSuchAlgorithmException | SignatureException e) {
            e.printStackTrace();
        }
    }
}
