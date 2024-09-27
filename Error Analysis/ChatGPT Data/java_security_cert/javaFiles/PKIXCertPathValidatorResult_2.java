import java.security.cert.PKIXCertPathValidatorResult;
import java.security.PublicKey;

public class PKIXCertPathValidatorResult_2 {
    public static void main(String[] args) {
        PKIXCertPathValidatorResult result = new PKIXCertPathValidatorResult(null, null, null, null);
        PublicKey publicKey = result.getPublicKey();
        System.out.println("Public Key: " + publicKey);
    }
}
