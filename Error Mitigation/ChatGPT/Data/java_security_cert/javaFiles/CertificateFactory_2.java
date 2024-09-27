import java.io.InputStream;
import java.security.cert.CertPath;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.Iterator;

public class CertificateFactory_2 {
    public static void main(String[] args) {
        try {
            CertificateFactory certFactory = CertificateFactory.getInstance("X.509");
            InputStream inStream = // provide input stream containing certificate data
            
            CertPath certPath = certFactory.generateCertPath(inStream);
            
            System.out.println("CertPath generated successfully: " + certPath);
        } catch (CertificateException e) {
            System.out.println("CertificateException: " + e.getMessage());
        }
    }
}
