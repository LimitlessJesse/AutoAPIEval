import java.math.BigInteger;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.spec.DSAPublicKeySpec;

public class DSAPublicKeySpec_4 {
    public static void main(String[] args) throws Exception {
        // Generate a DSA key pair
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("DSA");
        keyPairGenerator.initialize(1024);
        KeyPair keyPair = keyPairGenerator.generateKeyPair();

        // Get the DSA public key
        DSAPublicKeySpec publicKeySpec = keyPairGenerator.getKeyFactory().getKeySpec(keyPair.getPublic(), DSAPublicKeySpec.class);

        // Get the sub-prime q
        BigInteger q = publicKeySpec.getQ();

        System.out.println("Sub-prime q: " + q);
    }
}
