import java.math.BigInteger;
import java.security.spec.DSAParameterSpec;

public class DSAParameterSpec_2 {
    public static void main(String[] args) {
        DSAParameterSpec dsaParams = new DSAParameterSpec(BigInteger.valueOf(10), BigInteger.valueOf(5), BigInteger.valueOf(3));
        BigInteger q = dsaParams.getQ();
        System.out.println("Sub-prime q: " + q);
    }
}
