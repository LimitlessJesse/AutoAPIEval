import java.math.BigInteger;
import javax.crypto.spec.DHPrivateKeySpec;

public class DHPrivateKeySpec_2 {
    public static void main(String[] args) {
        BigInteger privateValue = new BigInteger("12345678901234567890");
        DHPrivateKeySpec dhPrivateKeySpec = new DHPrivateKeySpec(privateValue, 1024, 1024);
        BigInteger x = dhPrivateKeySpec.getX();
        System.out.println("Private value x: " + x);
    }
}
