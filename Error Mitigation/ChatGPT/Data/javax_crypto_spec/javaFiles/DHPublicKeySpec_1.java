import javax.crypto.spec.DHPublicKeySpec;
import java.math.BigInteger;

public class DHPublicKeySpec_1 {
    public static void main(String[] args) {
        BigInteger y = new BigInteger("1234567890"); // Example value for y
        DHPublicKeySpec dhPublicKeySpec = new DHPublicKeySpec(y);
        BigInteger publicKeyY = dhPublicKeySpec.getY();
        System.out.println("Public value y: " + publicKeyY);
    }
}
