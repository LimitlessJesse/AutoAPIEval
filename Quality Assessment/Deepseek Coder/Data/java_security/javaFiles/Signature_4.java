import java.security.*;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Base64;

public class Signature_4 {
    public static void main(String[] args) throws Exception {
        // Generate a private key
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(2048);
        KeyPair keyPair = keyPairGenerator.generateKeyPair();
        PrivateKey privateKey = keyPair.getPrivate();

        // Initialize a signature object with the private key
        Signature signature = Signature.getInstance("SHA256withRSA");
        signature.initSign(privateKey);

        // Update the signature with some data
        String data = "Hello, World!";
        signature.update(data.getBytes());

        // Generate the signature
        byte[] signatureBytes = signature.sign();

        // Print the signature
        System.out.println("Signature: " + Base64.getEncoder().encodeToString(signatureBytes));
    }
}
