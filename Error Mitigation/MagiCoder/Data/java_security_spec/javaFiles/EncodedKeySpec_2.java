import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.spec.EncodedKeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

public class EncodedKeySpec_2 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        // Generate a key pair
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
        keyGen.initialize(1024);
        KeyPair pair = keyGen.generateKeyPair();

        // Get the public and private key
        byte[] pubKey = pair.getPublic().getEncoded();
        byte[] privKey = pair.getPrivate().getEncoded();

        // Create an encoded key spec for the public key
        EncodedKeySpec pubKeySpec = new X509EncodedKeySpec(pubKey);

        // Create an encoded key spec for the private key
        EncodedKeySpec privKeySpec = new PKCS8EncodedKeySpec(privKey);

        // Get the encoded keys
        byte[] pubEncoded = pubKeySpec.getEncoded();
        byte[] privEncoded = privKeySpec.getEncoded();

        // Print the encoded keys
        System.out.println("Public key encoded: " + new String(pubEncoded));
        System.out.println("Private key encoded: " + new String(privEncoded));
    }
}
