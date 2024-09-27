import javax.crypto.ExemptionMechanism;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import java.security.AlgorithmParameterSpec;
import java.security.NoSuchAlgorithmException;

public class ExemptionMechanism_1 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        SecretKey secretKey = keyGenerator.generateKey();

        AlgorithmParameterSpec params = new IvParameterSpec(new byte[16]);

        ExemptionMechanism exemptionMechanism = ExemptionMechanism.getInstance("AES");
        exemptionMechanism.init(secretKey, params);
    }
}
