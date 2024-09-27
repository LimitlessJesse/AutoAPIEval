import java.security.InvalidKeyException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.PublicKey;
import java.security.SignedObject;

public class SignedObject_5 {
    public static void main(String[] args) {
        try {
            // Create a new SignedObject
            SignedObject signedObject = new SignedObject(new Object(), "SHA1withRSA");

            // Get the public key
            PublicKey publicKey = signedObject.getPublicKey();

            // Get the signature
            Signature signature = signedObject.getSignature();

            // Verify the signature
            boolean isValid = signedObject.verify(publicKey, signature);

            System.out.println("Signature is valid: " + isValid);
        } catch (InvalidKeyException | SignatureException e) {
            e.printStackTrace();
        }
    }
}
