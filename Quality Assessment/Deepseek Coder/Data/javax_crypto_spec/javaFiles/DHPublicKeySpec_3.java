import java.math.BigInteger;
import javax.crypto.spec.DHPublicKeySpec;

public class DHPublicKeySpec_3 {
    public static void main(String[] args) {
        // Create a DHPublicKeySpec object
        DHPublicKeySpec dhPublicKeySpec = new DHPublicKeySpec(BigInteger.ONE, BigInteger.ONE);
        
        // Get the y value from the DHPublicKeySpec object
        BigInteger y = dhPublicKeySpec.getY();
        
        // Print the y value
        System.out.println(y);
    }
}
