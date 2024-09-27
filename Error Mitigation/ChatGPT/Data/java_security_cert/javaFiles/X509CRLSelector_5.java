import java.security.cert.X509CRLSelector;
import javax.security.auth.x500.X500Principal;
import java.io.IOException;

public class X509CRLSelector_5 {
    public static void main(String[] args) {
        X509CRLSelector crlSelector = new X509CRLSelector();
        try {
            crlSelector.addIssuerName("CN=Example");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
