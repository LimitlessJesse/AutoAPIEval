import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.io.FileInputStream;
import java.io.IOException;

public class TrustAnchor_2 {
    public static void main(String[] args) {
        try {
            CertificateFactory cf = CertificateFactory.getInstance("X.509");
            FileInputStream fis = new FileInputStream("path_to_your_certificate.cer");
            X509Certificate cert = (X509Certificate) cf.generateCertificate(fis);
            fis.close();

            TrustAnchor ta = new TrustAnchor(cert, null);
            X509Certificate trustedCert = ta.getTrustedCert();

            if (trustedCert!= null) {
                System.out.println("Trusted Certificate: " + trustedCert.getSubjectDN());
            } else {
                System.out.println("Trust anchor was not specified as a trusted certificate");
            }
        } catch (CertificateException | IOException e) {
            e.printStackTrace();
        }
    }
}
