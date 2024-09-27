import java.security.cert.PKIXCertPathChecker;
import java.security.cert.CertificateException;

public class PKIXCertPathChecker_1 {
    public static void main(String[] args) {
        PKIXCertPathChecker checker = new PKIXCertPathChecker() {
            @Override
            public void init(boolean forwardChecking) throws CertificateException {
                super.init(forwardChecking);
            }
        };

        try {
            checker.init(true);
        } catch (CertificateException e) {
            e.printStackTrace();
        }
    }
}
