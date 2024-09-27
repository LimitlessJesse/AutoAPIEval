import java.math.BigInteger;
import java.security.spec.DSAPrivateKeySpec;

public class DSAPrivateKeySpec_3 {
    public static void main(String[] args) {
        // Create a DSAPrivateKeySpec object
        DSAPrivateKeySpec privateKeySpec = new DSAPrivateKeySpec(new BigInteger("1234567890"), new BigInteger("9876543210"), new BigInteger("13579"), new BigInteger("24680"));

        // Get the sub-prime q using getQ() method
        BigInteger q = privateKeySpec.getQ();

        // Print the sub-prime q
        System.out.println("Sub-prime q: " + q);
    }
}
