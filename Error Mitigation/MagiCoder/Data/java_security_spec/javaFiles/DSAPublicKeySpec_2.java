import java.math.BigInteger;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.spec.DSAPublicKeySpec;

public class DSAPublicKeySpec_2 {
    public static void main(String[] args) throws Exception {
        // Generate a DSA key pair
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("DSA");
        keyPairGenerator.initialize(1024);
        KeyPair keyPair = keyPairGenerator.generateKeyPair();

        // Get the DSA public key
        DSAPublicKeySpec publicKeySpec = keyPairGenerator.getKeyFactory().getKeySpec(keyPair.getPublic(), DSAPublicKeySpec.class);

        // Get the value of g
        BigInteger g = publicKeySpec.getG();

        // Print the value of g
        System.out.println("The value of g is: " + g);
    }
}
