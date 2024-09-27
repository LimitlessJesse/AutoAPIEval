import java.security.KeyStore;
import java.security.KeyStore.TrustedCertificateEntry;
import java.security.cert.Certificate;

public class KeyStore_TrustedCertificateEntry_1 {
    public static void main(String[] args) {
        KeyStore keyStore = KeyStore.getInstance("JKS");
        TrustedCertificateEntry trustedCertEntry = (TrustedCertificateEntry) keyStore.getEntry("alias", null);
        
        Certificate trustedCert = trustedCertEntry.getTrustedCertificate();
        System.out.println("Trusted Certificate: " + trustedCert);
    }
}
