import java.security.cert.CertPath;
import java.security.cert.Certificate;
import java.util.List;

public class CertPath_1 {
    public static void main(String[] args) {
        CertPath certPath = // obtain CertPath object
        
        List<? extends Certificate> certificates = certPath.getCertificates();
        
        for (Certificate cert : certificates) {
            System.out.println(cert);
        }
    }
}
