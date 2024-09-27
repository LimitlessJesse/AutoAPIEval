import javax.crypto.spec.DHPrivateKeySpec;
import java.math.BigInteger;

public class DHPrivateKeySpec_1 {
    public static void main(String[] args) {
        // Example code to demonstrate the use of getX() method from DHPrivateKeySpec
        BigInteger x = new BigInteger("1234567890"); // Sample value for private key x
        DHPrivateKeySpec privateKeySpec = new DHPrivateKeySpec(x);
        
        BigInteger privateKeyX = privateKeySpec.getX(); // Getting the private key x
        
        System.out.println("Private key x: " + privateKeyX);
    }
}
