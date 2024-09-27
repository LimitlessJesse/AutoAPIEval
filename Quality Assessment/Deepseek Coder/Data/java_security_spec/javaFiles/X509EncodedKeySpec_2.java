import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.spec.X509EncodedKeySpec;

public class X509EncodedKeySpec_2 {
    public static void main(String[] args) {
        try {
            // Generate a key pair
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(2048);
            KeyPair keyPair = keyPairGenerator.generateKeyPair();

            // Get the public key
            byte[] publicKeyBytes = keyPair.getPublic().getEncoded();

            // Create a X509EncodedKeySpec from the public key
            X509EncodedKeySpec publicKeySpec = new X509EncodedKeySpec(publicKeyBytes);

            // Get the encoded form of the public key
            byte[] encodedPublicKey = publicKeySpec.getEncoded();

            // Print the encoded form of the public key
            System.out.println("Encoded form of the public key:");
            for (byte b : encodedPublicKey) {
                System.out.print(b + " ");
            }
            System.out.println();

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
