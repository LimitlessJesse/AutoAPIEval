import java.security.KeyStore;

public class KeyStore_TrustedCertificateEntry_3 {
    public static void main(String[] args) {
        KeyStore.TrustedCertificateEntry entry = new KeyStore.TrustedCertificateEntry(null);
        System.out.println(entry.toString());
    }
}
