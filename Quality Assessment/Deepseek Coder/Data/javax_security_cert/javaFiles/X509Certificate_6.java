import java.security.cert.X509Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.cert.Certificate;

public class X509Certificate_6 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("path_to_your_certificate.cer");
            CertificateFactory cf = CertificateFactory.getInstance("X.509");
            Certificate cert = cf.generateCertificate(fis);
            X509Certificate x509Cert = (X509Certificate) cert;
            System.out.println("Signature Algorithm Name: " + x509Cert.getSigAlgName());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (CertificateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
