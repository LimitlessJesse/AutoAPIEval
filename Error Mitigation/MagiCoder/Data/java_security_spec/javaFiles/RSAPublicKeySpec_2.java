import java.math.BigInteger;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.spec.RSAPublicKeySpec;

public class RSAPublicKeySpec_2 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        // Generate a pair of RSA keys
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(2048);
        KeyPair keyPair = keyPairGenerator.generateKeyPair();

        // Get the public key
        RSAPublicKeySpec publicKeySpec = keyPair.getPublic().getEncoded();

        // Get the modulus
        BigInteger modulus = publicKeySpec.getModulus();

        System.out.println("Modulus: " + modulus);
    }
}
