import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;

public class CertificateFactory_1 {
    public static void main(String[] args) {
        try {
            CertificateFactory cf = CertificateFactory.getInstance("X.509");
            System.out.println("CertificateFactory instance created successfully");
        } catch (CertificateException e) {
            e.printStackTrace();
        }
    }
}
