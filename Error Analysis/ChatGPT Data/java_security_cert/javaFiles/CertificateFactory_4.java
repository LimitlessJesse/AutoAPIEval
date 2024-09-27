import java.io.InputStream;
import java.security.cert.CertificateFactory;
import java.security.cert.CRL;
import java.util.Collection;

public class CertificateFactory_4 {
    public static void main(String[] args) {
        try {
            InputStream inStream = // provide InputStream instance here
            Collection<? extends CRL> crls = generateCRLs(inStream);
            // do something with the generated CRLs
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Collection<? extends CRL> generateCRLs(InputStream inStream) throws Exception {
        CertificateFactory cf = CertificateFactory.getInstance("X.509");
        return cf.generateCRLs(inStream);
    }
}
