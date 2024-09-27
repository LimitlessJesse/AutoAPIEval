import java.math.BigInteger;
import javax.crypto.spec.DHPublicKeySpec;

public class DHPublicKeySpec_2 {
    public static void main(String[] args) {
        BigInteger g = new BigInteger("10");
        BigInteger p = new BigInteger("100");
        BigInteger y = new BigInteger("1000");

        DHPublicKeySpec dhPublicKeySpec = new DHPublicKeySpec(y, p, g);

        BigInteger gValue = dhPublicKeySpec.getG();

        System.out.println("The value of g is: " + gValue);
    }
}
