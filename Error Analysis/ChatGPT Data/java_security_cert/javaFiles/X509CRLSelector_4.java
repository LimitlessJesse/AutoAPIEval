import java.security.cert.X509CRLSelector;
import java.security.Principal;
import javax.security.auth.x500.X500Principal;

public class X509CRLSelector_4 {
    public static void main(String[] args) {
        X509CRLSelector crlSelector = new X509CRLSelector();
        X500Principal issuer = new X500Principal("CN=Test");
        crlSelector.addIssuer(issuer);
        
        // Use the X509CRLSelector with added issuer
    }
}
