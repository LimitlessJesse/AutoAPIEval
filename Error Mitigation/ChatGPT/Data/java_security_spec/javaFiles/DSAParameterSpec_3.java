import java.math.BigInteger;
import java.security.spec.DSAParameterSpec;

public class DSAParameterSpec_3 {
    public static void main(String[] args) {
        DSAParameterSpec dsaParams = new DSAParameterSpec(BigInteger.valueOf(5), BigInteger.valueOf(3), BigInteger.valueOf(7));
        BigInteger baseG = dsaParams.getG();
        System.out.println("Base g: " + baseG);
    }
}
