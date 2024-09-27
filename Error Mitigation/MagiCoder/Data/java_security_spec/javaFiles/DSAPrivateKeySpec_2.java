import java.math.BigInteger;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.spec.DSAPrivateKeySpec;

public class DSAPrivateKeySpec_2 {
    public static void main(String[] args) throws Exception {
        // Generate a DSA key pair
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("DSA");
        keyPairGenerator.initialize(1024);
        KeyPair keyPair = keyPairGenerator.generateKeyPair();

        // Get the private key
        DSAPrivateKeySpec privateKeySpec = keyPairGenerator.getKeyFactory().getKeySpec(keyPair.getPrivate(), DSAPrivateKeySpec.class);

        // Get the private key x
        BigInteger x = privateKeySpec.getX();

        // Print the private key x
        System.out.println("Private key x: " + x);
    }
}
