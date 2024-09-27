import java.security.KeyPairGenerator;
import java.security.spec.AlgorithmParameterSpec;

public class KeyPairGenerator_4 {
    public static void main(String[] args) {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        AlgorithmParameterSpec params = null;
        keyPairGenerator.initialize(params);
    }
}
