import java.security.KeyStore;
import java.security.cert.Certificate;
import java.security.KeyStore.PrivateKeyEntry;

public class KeyStore_PrivateKeyEntry_1 {
    public static void main(String[] args) {
        KeyStore keyStore = KeyStore.getInstance("JKS");
        // Load the keystore
        keyStore.load(null, null);
        
        // Get the PrivateKeyEntry from the keystore
        KeyStore.PrivateKeyEntry privateKeyEntry = (KeyStore.PrivateKeyEntry) keyStore.getEntry("alias", null);
        
        // Get the certificate chain from the PrivateKeyEntry
        Certificate[] certificateChain = privateKeyEntry.getCertificateChain();
        
        // Print out the certificate chain
        for (Certificate cert : certificateChain) {
            System.out.println(cert);
        }
    }
}
