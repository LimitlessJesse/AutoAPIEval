import java.security.Signature;
import java.security.SignatureException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.NoSuchAlgorithmException;

public class Signature_5 {
    public static void main(String[] args) {
        try {
            // Generate a key pair
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(2048);
            KeyPair keyPair = keyPairGenerator.generateKeyPair();
            PrivateKey privateKey = keyPair.getPrivate();
            PublicKey publicKey = keyPair.getPublic();

            // Create a Signature object and initialize it with the public key
            Signature signature = Signature.getInstance("SHA256withRSA");
            signature.initSign(privateKey);

            // Update the signature object with the data to be signed
            byte[] data = "Hello, World!".getBytes();
            signature.update(data);

            // Generate the signature
            byte[] signatureBytes = signature.sign();

            // Print the signature
            System.out.println("Signature: " + new String(signatureBytes));
        } catch (NoSuchAlgorithmException | SignatureException e) {
            e.printStackTrace();
        }
    }
}
