import java.math.BigInteger;
import java.security.spec.RSAPrivateKeySpec;

public class RSAPrivateKeySpec_1 {
    public static void main(String[] args) {
        BigInteger modulus = getModulus(new RSAPrivateKeySpec(BigInteger.ONE, BigInteger.TWO));
        System.out.println("Modulus: " + modulus);
    }

    public static BigInteger getModulus(RSAPrivateKeySpec privateKeySpec) {
        return privateKeySpec.getModulus();
    }
}
