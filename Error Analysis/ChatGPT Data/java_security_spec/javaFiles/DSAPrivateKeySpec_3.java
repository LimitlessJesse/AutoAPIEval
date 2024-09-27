import java.math.BigInteger;
import java.security.spec.DSAPrivateKeySpec;

public class DSAPrivateKeySpec_3 {
    public static void main(String[] args) {
        DSAPrivateKeySpec keySpec = new DSAPrivateKeySpec(new BigInteger("12345"), new BigInteger("6789"), new BigInteger("101112"), new BigInteger("131415"));
        
        BigInteger q = keySpec.getQ();
        System.out.println("Q: " + q);
    }
}
