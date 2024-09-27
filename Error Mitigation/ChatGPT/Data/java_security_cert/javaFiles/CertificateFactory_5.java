import java.io.InputStream;
import java.security.cert.CRL;
import java.security.cert.CRLException;
import java.security.cert.CertificateFactory;
import java.util.Collection;

public class CertificateFactory_5 {
    public static void main(String[] args) {
        try {
            CertificateFactory cf = CertificateFactory.getInstance("X.509");
            InputStream inStream = // provide input stream with CRL data
            Collection<? extends CRL> crls = cf.generateCRLs(inStream);
            
            for (CRL crl : crls) {
                // Process each CRL object
                System.out.println(crl);
            }
        } catch (CRLException e) {
            e.printStackTrace();
        }
    }
}
