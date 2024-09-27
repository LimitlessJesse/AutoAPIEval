import javax.crypto.spec.DHPublicKeySpec;
import java.math.BigInteger;

public class DHPublicKeySpec_1 {
    public static void main(String[] args) {
        DHPublicKeySpec keySpec = new DHPublicKeySpec(BigInteger.valueOf(10), BigInteger.valueOf(5), BigInteger.valueOf(3), BigInteger.valueOf(7));
        BigInteger p = keySpec.getP();
        System.out.println("P value: " + p);
    }
}
