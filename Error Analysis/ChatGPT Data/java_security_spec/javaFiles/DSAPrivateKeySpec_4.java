import java.math.BigInteger;
import java.security.spec.DSAPrivateKeySpec;

public class DSAPrivateKeySpec_4 {
    public static void main(String[] args) {
        // Create a DSAPrivateKeySpec object
        DSAPrivateKeySpec privateKeySpec = new DSAPrivateKeySpec(new BigInteger("1234567890"), new BigInteger("9876543210"), new BigInteger("13579"), new BigInteger("24680"));

        // Get the value of 'g' using getG() method
        BigInteger gValue = privateKeySpec.getG();

        // Print the value of 'g'
        System.out.println("Value of 'g': " + gValue);
    }
}
