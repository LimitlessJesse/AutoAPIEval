import javax.crypto.spec.DHParameterSpec;
import java.math.BigInteger;

public class DHParameterSpec_1 {
    public static void main(String[] args) {
        DHParameterSpec dhParamSpec = new DHParameterSpec(BigInteger.valueOf(5), BigInteger.valueOf(3));
        BigInteger primeModulus = dhParamSpec.getP();
        System.out.println("Prime modulus p: " + primeModulus);
    }
}
