import java.security.cert.X509CRLSelector;
import javax.security.auth.x500.X500Principal;
import java.util.Collection;
import java.util.ArrayList;

public class X509CRLSelector_1 {
    public static void main(String[] args) {
        X509CRLSelector crlSelector = new X509CRLSelector();
        
        Collection<X500Principal> issuers = new ArrayList<>();
        issuers.add(new X500Principal("CN=Issuer1"));
        issuers.add(new X500Principal("CN=Issuer2"));
        
        crlSelector.setIssuers(issuers);
    }
}
