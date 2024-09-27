import java.math.BigInteger;
import javax.crypto.spec.DHPrivateKeySpec;

public class DHPrivateKeySpec_3 {
    public static void main(String[] args) {
        // Create a BigInteger for g
        BigInteger g = new BigInteger("1234567890");

        // Create a BigInteger for p
        BigInteger p = new BigInteger("9876543210");

        // Create a BigInteger for x
        BigInteger x = new BigInteger("1122334455");

        // Create a DHPrivateKeySpec
        DHPrivateKeySpec dhPrivateKeySpec = new DHPrivateKeySpec(g, p, x);

        // Get the g value from the DHPrivateKeySpec
        BigInteger gValue = dhPrivateKeySpec.getG();

        // Print the g value
        System.out.println("g value: " + gValue);
    }
}
