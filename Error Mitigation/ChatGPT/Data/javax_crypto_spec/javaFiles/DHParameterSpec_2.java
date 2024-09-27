import javax.crypto.spec.DHParameterSpec;
import java.math.BigInteger;

public class DHParameterSpec_2 {
    public static void main(String[] args) {
        DHParameterSpec dhParamSpec = new DHParameterSpec(BigInteger.valueOf(5), BigInteger.valueOf(2));
        BigInteger baseGenerator = dhParamSpec.getG();
        System.out.println("Base generator g: " + baseGenerator);
    }
}
