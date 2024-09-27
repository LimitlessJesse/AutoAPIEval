import java.security.cert.PKIXBuilderParameters;
import java.security.cert.CertificateException;

public class PKIXBuilderParameters_4 {
    public static void main(String[] args) {
        try {
            PKIXBuilderParameters pkixParams = new PKIXBuilderParameters();
            pkixParams.setMaxPathLength(10);
        } catch (CertificateException e) {
            e.printStackTrace();
        }
    }
}
