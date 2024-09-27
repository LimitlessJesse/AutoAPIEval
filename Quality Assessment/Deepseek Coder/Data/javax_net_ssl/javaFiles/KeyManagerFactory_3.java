import javax.net.ssl.KeyManagerFactory;
import java.security.KeyStore;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.KeyStoreException;

public class KeyManagerFactory_3 {
    public static void main(String[] args) {
        try {
            // Load the KeyStore
            KeyStore keyStore = KeyStore.getInstance("JKS");
            keyStore.load(new FileInputStream("keystore.jks"), "password".toCharArray());

            // Initialize the KeyManagerFactory
            KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
            keyManagerFactory.init(keyStore, "password".toCharArray());

            // Get the KeyManagers
            javax.net.ssl.KeyManager[] keyManagers = keyManagerFactory.getKeyManagers();

            // Print the KeyManagers
            for (javax.net.ssl.KeyManager keyManager : keyManagers) {
                System.out.println(keyManager);
            }
        } catch (KeyStoreException | NoSuchAlgorithmException | CertificateException | IOException e) {
            e.printStackTrace();
        }
    }
}
