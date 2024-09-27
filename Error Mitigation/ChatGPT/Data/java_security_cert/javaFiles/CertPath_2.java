import java.security.cert.CertPath;
import java.security.cert.Certificate;
import java.util.List;

public class CertPath_2 {
    public static void main(String[] args) {
        CertPath certPath = // initialize CertPath object
        List<? extends Certificate> certificates = certPath.getCertificates();
        
        for (Certificate cert : certificates) {
            String type = cert.getType();
            System.out.println("Certificate type: " + type);
        }
    }
}
