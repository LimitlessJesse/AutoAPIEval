import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.util.Set;

public class X509CRL_2 {
    public static void main(String[] args) {
        X509CRL crl = // initialize X509CRL object
        Set<? extends X509CRLEntry> revokedCertificates = crl.getRevokedCertificates();
        
        if(revokedCertificates != null) {
            for(X509CRLEntry entry : revokedCertificates) {
                // Perform operations with each X509CRLEntry object
            }
        } else {
            System.out.println("No revoked certificates present.");
        }
    }
}
