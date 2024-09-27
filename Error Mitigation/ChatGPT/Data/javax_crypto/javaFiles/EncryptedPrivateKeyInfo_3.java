import javax.crypto.EncryptedPrivateKeyInfo;
import java.security.spec.AlgorithmParameterSpec;
import java.security.AlgorithmParameters;

public class EncryptedPrivateKeyInfo_3 {
    public static void main(String[] args) {
        EncryptedPrivateKeyInfo encryptedPrivateKeyInfo = new EncryptedPrivateKeyInfo(new byte[]{});
        AlgorithmParameters algorithmParameters = encryptedPrivateKeyInfo.getAlgParameters();
        System.out.println("Algorithm Parameters: " + algorithmParameters);
    }
}
