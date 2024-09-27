import java.security.*;

public class Signature_3 {
    public static void main(String[] args) {
        // Assume 'signature' is a byte array representing a signature
        
        // Initialize Signature object
        Signature sig = Signature.getInstance("SHA256withRSA");
        
        // Initialize public key and set it to the Signature object if needed
        // PublicKey publicKey = ...;
        // sig.initVerify(publicKey);
        
        // Verify the signature
        boolean isVerified = sig.verify(signature);
        
        System.out.println("Signature verified: " + isVerified);
    }
}
