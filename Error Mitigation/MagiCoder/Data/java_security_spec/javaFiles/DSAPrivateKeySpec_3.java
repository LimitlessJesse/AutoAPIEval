import java.math.BigInteger;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.spec.DSAPrivateKeySpec;

public class DSAPrivateKeySpec_3 {
    public static void main(String[] args) throws Exception {
        // Generate a DSA key pair
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("DSA");
        keyPairGenerator.initialize(1024);
        KeyPair keyPair = keyPairGenerator.generateKeyPair();

        // Get the DSA private key
        DSAPrivateKeySpec privateKeySpec = keyPairGenerator.getKeyFactory().getKeySpec(keyPair.getPrivate(), DSAPrivateKeySpec.class);

        // Get the prime p
        BigInteger p = privateKeySpec.getP();

        System.out.println("Prime p: " + p);
    }
}
