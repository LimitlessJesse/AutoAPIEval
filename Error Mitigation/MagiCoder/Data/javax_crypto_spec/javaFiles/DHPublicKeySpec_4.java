import java.math.BigInteger;
import javax.crypto.spec.DHPublicKeySpec;

public class DHPublicKeySpec_4 {
    public static void main(String[] args) {
        BigInteger g = new BigInteger("2");
        BigInteger p = new BigInteger("23");
        BigInteger y = new BigInteger("5");

        DHPublicKeySpec dhPublicKeySpec = new DHPublicKeySpec(y, p, g);

        BigInteger publicY = dhPublicKeySpec.getY();

        System.out.println("Public Y: " + publicY);
    }
}
