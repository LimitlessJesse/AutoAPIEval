import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.cert.CertificateException;

public class Certificate_3 {
    public static void main(String[] args) {
        try {
            CertificateFactory cf = CertificateFactory.getInstance("X.509");
            FileInputStream fis = new FileInputStream("path_to_your_certificate.cer");
            Certificate cert = cf.generateCertificate(fis);
            System.out.println(cert.toString());
        } catch (CertificateException | FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
