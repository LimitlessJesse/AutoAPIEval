import java.security.AlgorithmParameterGenerator;
import java.security.AlgorithmParameterSpec;

public class AlgorithmParameterGenerator_4 {
    public static void main(String[] args) {
        AlgorithmParameterGenerator paramGen = AlgorithmParameterGenerator.getInstance("RSA");
        paramGen.init(new RSAKeyGenParameterSpec(1024, RSAKeyGenParameterSpec.F4));
    }
}
