import java.security.cert.X509CertSelector;
import javax.security.auth.x500.X500Principal;

public class X509CertSelector_2 {
    public static void main(String[] args) {
        X509CertSelector certSelector = new X509CertSelector();
        X500Principal issuer = new X500Principal("CN=Test");
        certSelector.setIssuer(issuer);
    }
}
