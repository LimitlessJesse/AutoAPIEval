import java.security.Signature;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.MessageDigest;

public class Signature_2 {
    public static void main(String[] args) {
        try {
            // Generate key pair
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("DSA");
            KeyPair keyPair = keyPairGenerator.generateKeyPair();
            PrivateKey privateKey = keyPair.getPrivate();
            PublicKey publicKey = keyPair.getPublic();
            
            // Create Signature object
            Signature signature = Signature.getInstance("SHA256withDSA");
            
            // Initialize Signature object with private key for signing
            signature.initSign(privateKey);
            
            // Generate data
            byte[] data = "Hello, World!".getBytes();
            
            // Update Signature object with data for signing
            signature.update(data);
            
            // Sign the data and get the signature
            byte[] signatureBytes = signature.sign();
            
            System.out.println("Signature: " + new String(signatureBytes));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
