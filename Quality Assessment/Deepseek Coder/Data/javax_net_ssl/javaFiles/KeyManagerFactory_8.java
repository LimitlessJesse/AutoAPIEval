import javax.net.ssl.KeyManagerFactory;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;

public class KeyManagerFactory_8 {
    public static void main(String[] args) {
        try {
            // Create a KeyStore instance
            KeyStore ks = KeyStore.getInstance("JKS");

            // Load the KeyStore with a keystore file
            ks.load(new java.io.FileInputStream("keystore.jks"), "password".toCharArray());

            // Initialize the KeyManagerFactory
            KeyManagerFactory kmf = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());

            // Initialize the KeyManagerFactory with the KeyStore and password
            kmf.init(ks, "password".toCharArray());

            System.out.println("KeyManagerFactory initialized successfully");

        } catch (KeyStoreException | NoSuchAlgorithmException | UnrecoverableKeyException | java.io.IOException e) {
            System.out.println("Failed to initialize KeyManagerFactory: " + e.getMessage());
        }
    }
}
