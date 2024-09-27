import java.security.cert.X509Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class X509Certificate_5 {
    public static void main(String[] args) {
        try {
            CertificateFactory cf = CertificateFactory.getInstance("X.509");
            InputStream in = new FileInputStream("path_to_your_certificate");
            X509Certificate cert = (X509Certificate) cf.generateCertificate(in);
            System.out.println(cert.getSigAlgName());
        } catch (CertificateException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
