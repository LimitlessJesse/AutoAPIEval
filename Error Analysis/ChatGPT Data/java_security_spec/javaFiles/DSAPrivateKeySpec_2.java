import java.math.BigInteger;
import java.security.spec.DSAPrivateKeySpec;

public class DSAPrivateKeySpec_2 {
    public static void main(String[] args) {
        DSAPrivateKeySpec privateKeySpec = new DSAPrivateKeySpec(new BigInteger("12345"), new BigInteger("54321"), new BigInteger("12345"), new BigInteger("54321"));
        BigInteger p = privateKeySpec.getP();
        System.out.println("P value: " + p);
    }
}
