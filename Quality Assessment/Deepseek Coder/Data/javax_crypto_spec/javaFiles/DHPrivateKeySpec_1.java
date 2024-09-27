import java.math.BigInteger;
import javax.crypto.spec.DHPrivateKeySpec;

public class DHPrivateKeySpec_1 {
    public static void main(String[] args) {
        // Create a DHPrivateKeySpec object
        DHPrivateKeySpec dhPrivateKeySpec = new DHPrivateKeySpec(BigInteger.ONE, BigInteger.ONE, BigInteger.ONE);
        
        // Get the x value from the DHPrivateKeySpec object
        BigInteger x = dhPrivateKeySpec.getX();
        
        // Print the x value
        System.out.println(x);
    }
}
