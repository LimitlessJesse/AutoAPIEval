import java.io.FileInputStream;
import java.io.InputStream;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;

public class CertificateFactory_2 {
    public static void main(String[] args) {
        try {
            CertificateFactory cf = CertificateFactory.getInstance("X.509");
            InputStream in = new FileInputStream("path_to_your_certificate.cer");
            Certificate cert = cf.generateCertificate(in);
            System.out.println(cert);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
