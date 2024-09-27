import java.security.SignedObject;

public class SignedObject_3 {
    public static void main(String[] args) {
        // Assume signedObject is initialized and contains a signed object
        SignedObject signedObject = new SignedObject();
        
        // Retrieve the signature
        byte[] signature = signedObject.getSignature();
        
        // Print the signature
        System.out.println("Signature: " + signature);
    }
}
