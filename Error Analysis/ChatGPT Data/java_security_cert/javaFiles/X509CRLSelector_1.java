import java.security.cert.X509CRLSelector;
import javax.security.auth.x500.X500Principal;
import java.util.Collection;
import java.util.HashSet;

public class X509CRLSelector_1 {
    public static void main(String[] args) {
        X509CRLSelector crlSelector = new X509CRLSelector();
        Collection<X500Principal> issuers = new HashSet<>();
        X500Principal issuer1 = new X500Principal("CN=Issuer1");
        X500Principal issuer2 = new X500Principal("CN=Issuer2");
        issuers.add(issuer1);
        issuers.add(issuer2);
        
        crlSelector.setIssuers(issuers);
        
        System.out.println("Issuers set in CRL selector: " + crlSelector.getIssuers());
    }
}
