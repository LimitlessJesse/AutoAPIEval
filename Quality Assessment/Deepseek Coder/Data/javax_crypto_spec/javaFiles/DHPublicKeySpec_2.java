import java.math.BigInteger;
import javax.crypto.spec.DHPublicKeySpec;

public class DHPublicKeySpec_2 {
    public static void main(String[] args) {
        BigInteger g = new BigInteger("10");
        BigInteger p = new BigInteger("23");
        DHPublicKeySpec dhPublicKeySpec = new DHPublicKeySpec(g, p);
        System.out.println(dhPublicKeySpec.getP());
    }
}
