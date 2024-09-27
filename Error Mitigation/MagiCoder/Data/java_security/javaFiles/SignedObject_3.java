import java.security.*;
import java.security.Signature;

public class SignedObject_3 {
    public static void main(String[] args) throws Exception {
        // Create a new KeyPairGenerator object
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
        keyGen.initialize(1024);
        KeyPair pair = keyGen.generateKeyPair();
        PrivateKey priv = pair.getPrivate();
        PublicKey pub = pair.getPublic();

        // Create a new Signature object and initialize it with the private key
        Signature sign = Signature.getInstance("SHA1withRSA");
        sign.initSign(priv);

        // Update the Signature object with the data to be signed
        byte[] data = "Hello, World!".getBytes();
        sign.update(data);

        // Sign the data
        byte[] signature = sign.sign();

        // Create a new SignedObject object and initialize it with the data and signature
        SignedObject signedObject = new SignedObject(data, signature);

        // Retrieve the signature
        byte[] retrievedSignature = signedObject.getSignature();

        // Print the retrieved signature
        System.out.println("Retrieved Signature: " + new String(retrievedSignature));
    }
}
