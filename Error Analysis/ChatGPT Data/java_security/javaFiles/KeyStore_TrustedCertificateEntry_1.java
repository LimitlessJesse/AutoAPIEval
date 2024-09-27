import java.security.KeyStore.TrustedCertificateEntry;
import java.security.cert.Certificate;
import java.security.KeyStore;

public class KeyStore_TrustedCertificateEntry_1 {
    public static void main(String[] args) {
        try {
            KeyStore keyStore = KeyStore.getInstance("JKS");
            char[] password = "password".toCharArray();
            keyStore.load(null, password);
            
            TrustedCertificateEntry trustedCertEntry = (TrustedCertificateEntry) keyStore.getEntry("alias", null);
            Certificate trustedCert = trustedCertEntry.getTrustedCertificate();
            
            System.out.println("Trusted Certificate: " + trustedCert.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
