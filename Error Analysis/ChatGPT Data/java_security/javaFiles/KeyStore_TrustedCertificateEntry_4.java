import java.security.KeyStore;
import java.security.KeyStore.TrustedCertificateEntry;
import java.security.cert.Certificate;

public class KeyStore_TrustedCertificateEntry_4 {
    public static void main(String[] args) throws Exception {
        KeyStore keyStore = KeyStore.getInstance("JKS");
        keyStore.load(null, null);

        Certificate cert = // get certificate from somewhere

        TrustedCertificateEntry trustedCertEntry = new TrustedCertificateEntry(cert);
        String certString = trustedCertEntry.toString();

        System.out.println(certString);
    }
}
