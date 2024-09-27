import java.math.BigInteger;
import java.security.spec.DSAParameterSpec;

public class DSAParameterSpec_1 {
    public static void main(String[] args) {
        DSAParameterSpec dsaParams = new DSAParameterSpec(BigInteger.valueOf(11), BigInteger.valueOf(2), BigInteger.valueOf(3));
        BigInteger primeP = dsaParams.getP();
        System.out.println("Prime p: " + primeP);
    }
}
