import java.security.cert.PKIXBuilderParameters;
import java.security.cert.CertificateException;
import java.security.InvalidParameterException;

public class PKIXBuilderParameters_3 {
    public static void main(String[] args) {
        try {
            PKIXBuilderParameters pkixParams = new PKIXBuilderParameters(null, null);
            pkixParams.setMaxPathLength(10);
        } catch (InvalidParameterException e) {
            e.printStackTrace();
        }
    }
}
