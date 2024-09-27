import javax.crypto.EncryptedPrivateKeyInfo;
import java.security.AlgorithmParameters;
import java.security.spec.PKCS8EncodedKeySpec;

public class EncryptedPrivateKeyInfo_3 {
    public static void main(String[] args) throws Exception {
        // Sample encrypted private key info
        byte[] encoded = {} // your encrypted private key info bytes here

        EncryptedPrivateKeyInfo encryptedPrivateKeyInfo = new EncryptedPrivateKeyInfo(encoded);
        AlgorithmParameters algorithmParameters = encryptedPrivateKeyInfo.getAlgParameters();

        // Use algorithmParameters as needed
    }
}
