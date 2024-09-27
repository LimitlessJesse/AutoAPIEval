import java.security.cert.X509Certificate;
import java.security.cert.X509CRLSelector;

public class X509CRLSelector_3 {
    public static void main(String[] args) {
        X509CRLSelector crlSelector = new X509CRLSelector();
        X509Certificate cert = null; // Initialize with the X509Certificate being checked
        crlSelector.setCertificateChecking(cert);
    }
}
