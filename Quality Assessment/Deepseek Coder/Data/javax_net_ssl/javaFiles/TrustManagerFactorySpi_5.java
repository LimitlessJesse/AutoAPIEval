import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.ManagerFactoryParameters;
import javax.net.ssl.TrustManagerFactorySpi;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

public class TrustManagerFactorySpi_5 {
    public static void main(String[] args) throws NoSuchAlgorithmException, KeyStoreException, CertificateException {
        // Create a KeyStore
        KeyStore ks = KeyStore.getInstance(KeyStore.getDefaultType());
        ks.load(null, null);

        // Create a TrustManagerFactory
        TrustManagerFactory tmf = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());

        // Create a ManagerFactoryParameters
        ManagerFactoryParameters spec = new ManagerFactoryParameters(ks, null);

        // Initialize the TrustManagerFactory
        tmf.init(spec);
    }
}
