import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;

public class TrustAnchor_1 {
    public static void main(String[] args) {
        TrustAnchor trustAnchor = new TrustAnchor(/*initialize TrustAnchor object*/);
        X509Certificate trustedCert = trustAnchor.getTrustedCert();
        System.out.println("Trusted certificate: " + trustedCert.toString());
    }
}
