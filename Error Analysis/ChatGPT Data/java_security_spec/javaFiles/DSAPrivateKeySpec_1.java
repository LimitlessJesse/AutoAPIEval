import java.math.BigInteger;
import java.security.spec.DSAPrivateKeySpec;

public class DSAPrivateKeySpec_1 {
    public static void main(String[] args) {
        DSAPrivateKeySpec privateKeySpec = new DSAPrivateKeySpec(new BigInteger("1234567890"), new BigInteger("9876543210"), new BigInteger("13579"), new BigInteger("24680"));
        BigInteger x = privateKeySpec.getX();
        System.out.println("x value: " + x);
    }
}
