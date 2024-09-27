import javax.net.ssl.TrustManagerFactory;
import java.security.KeyStore;
import java.security.KeyStoreException;

public class TrustManagerFactory_4 {
    public static void main(String[] args) {
        TrustManagerFactory trustManagerFactory;
        try {
            trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
            keyStore.load(null, null); // Load a null keystore for demonstration purposes
            trustManagerFactory.init(keyStore);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
