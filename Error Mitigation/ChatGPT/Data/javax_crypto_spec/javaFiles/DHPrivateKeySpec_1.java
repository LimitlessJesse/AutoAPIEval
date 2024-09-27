import javax.crypto.spec.DHPrivateKeySpec;
import java.math.BigInteger;

public class DHPrivateKeySpec_1 {
    public static void main(String[] args) {
        BigInteger privateValue = new BigInteger("1234567890"); // Example private value
        DHPrivateKeySpec privateKeySpec = new DHPrivateKeySpec(privateValue);
        BigInteger x = privateKeySpec.getX();
        System.out.println("Private value x: " + x);
    }
}
