import java.io.FileInputStream;
import java.io.InputStream;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.CRL;
import java.security.cert.CRLException;

public class CertificateFactory_4 {
    public static void main(String[] args) {
        try {
            CertificateFactory cf = CertificateFactory.getInstance("X.509");
            InputStream in = new FileInputStream("path_to_your_crl_file");
            CRL crl = cf.generateCRL(in);
            System.out.println(crl);
        } catch (CertificateException | CRLException e) {
            e.printStackTrace();
        }
    }
}
