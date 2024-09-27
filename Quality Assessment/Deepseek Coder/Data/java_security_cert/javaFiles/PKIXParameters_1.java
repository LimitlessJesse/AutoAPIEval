import java.security.cert.PKIXParameters;
import java.security.cert.CertificateException;

public class PKIXParameters_1 {
    public static void main(String[] args) {
        try {
            PKIXParameters params = new PKIXParameters();
            params.setRevocationEnabled(false);
        } catch (CertificateException e) {
            e.printStackTrace();
        }
    }
}
