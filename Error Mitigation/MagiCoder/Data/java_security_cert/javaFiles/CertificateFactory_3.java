import java.io.FileInputStream;
import java.io.InputStream;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.CertPath;

public class CertificateFactory_3 {
    public static void main(String[] args) {
        try {
            CertificateFactory cf = CertificateFactory.getInstance("X.509");
            InputStream in = new FileInputStream("path_to_your_certificate.cer");
            CertPath certPath = cf.generateCertPath(in);
            System.out.println(certPath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
