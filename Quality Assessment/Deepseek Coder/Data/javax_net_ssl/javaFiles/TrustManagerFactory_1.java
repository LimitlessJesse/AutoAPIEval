import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.TrustManager;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

public class TrustManagerFactory_1 {
    public static void main(String[] args) {
        try {
            // Create a KeyStore instance
            KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());

            // Load the KeyStore with a KeyStore.load() method
            // keyStore.load(...);

            // Get the TrustManagerFactory instance
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());

            // Initialize the TrustManagerFactory with the KeyStore
            trustManagerFactory.init(keyStore);

            // Get the TrustManagers from the TrustManagerFactory
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();

            // Print the number of TrustManagers
            System.out.println("Number of TrustManagers: " + trustManagers.length);

            // Print the details of each TrustManager
            for (TrustManager trustManager : trustManagers) {
                System.out.println("TrustManager: " + trustManager.getClass().getName());
            }
        } catch (KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
            e.printStackTrace();
        }
    }
}
