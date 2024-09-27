import java.io.FileInputStream;
import java.io.InputStream;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

public class CertificateFactory_1 {
    public static void main(String[] args) {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            
            // Load a certificate from a file input stream
            InputStream inStream = new FileInputStream("example.crt");
            X509Certificate certificate = (X509Certificate) certificateFactory.generateCertificate(inStream);
            
            System.out.println("Certificate: " + certificate);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
