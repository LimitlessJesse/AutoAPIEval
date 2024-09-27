import java.security.KeyPairGenerator;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;

public class KeyPairGenerator_5 {
    public static void main(String[] args) {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            AlgorithmParameterSpec params = null; // specify the algorithm parameter spec here
            keyPairGenerator.initialize(params);
        } catch (InvalidAlgorithmParameterException e) {
            e.printStackTrace();
        }
    }
}
