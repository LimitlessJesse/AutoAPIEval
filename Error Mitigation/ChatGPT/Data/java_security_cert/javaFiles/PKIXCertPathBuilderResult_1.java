import java.security.cert.CertPathBuilderResult;
import java.security.cert.CertPath;

public class PKIXCertPathBuilderResult_1 {
    public static void main(String[] args) {
        CertPathBuilderResult result = new PKIXCertPathBuilderResult();
        CertPath certPath = result.getCertPath();
        System.out.println(certPath);
    }
}
