import java.math.BigInteger;
import java.security.spec.DSAPrivateKeySpec;

public class DSAPrivateKeySpec_1 {
    public static void main(String[] args) {
        // Create a DSAPrivateKeySpec object
        BigInteger x = new BigInteger("1234567890"); // Example private key value
        DSAPrivateKeySpec privateKeySpec = new DSAPrivateKeySpec(x, new BigInteger("9876543210"), new BigInteger("1234567890"), new BigInteger("1357924680"));

        // Get the private key x using getX() method
        BigInteger privateKey = privateKeySpec.getX();

        // Print the private key x
        System.out.println("Private Key x: " + privateKey);
    }
}
