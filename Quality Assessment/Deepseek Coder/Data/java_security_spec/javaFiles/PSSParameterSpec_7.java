import java.security.spec.PSSParameterSpec;
import java.math.BigInteger;

public class PSSParameterSpec_7 {
    public static void main(String[] args) {
        PSSParameterSpec pssParameterSpec = new PSSParameterSpec(
            "SHA-256",
            "MGF1",
            new BigInteger("1000000000000000000000000000000000000000000000000000000000000000", 16),
            "SHA-256"
        );

        System.out.println(pssParameterSpec.toString());
    }
}
