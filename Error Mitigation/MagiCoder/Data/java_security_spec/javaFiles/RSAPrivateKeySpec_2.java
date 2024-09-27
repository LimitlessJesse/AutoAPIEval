import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPrivateKeySpec;

public class RSAPrivateKeySpec_2 {
    public static void main(String[] args) {
        try {
            // Create a new RSA private key
            BigInteger modulus = new BigInteger("1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890");
            BigInteger privateExponent = new BigInteger("1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890");

            // Create a new RSA private key spec
            RSAPrivateKeySpec privateKeySpec = new RSAPrivateKeySpec(modulus, privateExponent);

            // Create a new key factory
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");

            // Generate the private key
            PrivateKey privateKey = keyFactory.generatePrivate(privateKeySpec);

            // Get the modulus
            BigInteger modulusValue = privateKey.getModulus();

            System.out.println("Modulus: " + modulusValue);
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            e.printStackTrace();
        }
    }
}
