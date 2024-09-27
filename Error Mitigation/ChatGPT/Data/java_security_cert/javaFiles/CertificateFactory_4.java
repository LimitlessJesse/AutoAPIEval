import java.io.InputStream;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.Certificate;
import java.util.Collection;

public class CertificateFactory_4 {
    public static void main(String[] args) {
        try {
            CertificateFactory certFactory = CertificateFactory.getInstance("X.509");
            InputStream inStream = // provide input stream with certificates
            Collection<? extends Certificate> certificates = certFactory.generateCertificates(inStream);
            
            for (Certificate cert : certificates) {
                // Do something with each certificate
            }
        } catch (CertificateException e) {
            e.printStackTrace();
        }
    }
}
