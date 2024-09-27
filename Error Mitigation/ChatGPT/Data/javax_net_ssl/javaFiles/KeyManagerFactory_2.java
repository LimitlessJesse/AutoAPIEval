import javax.net.ssl.KeyManagerFactory;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;

public class KeyManagerFactory_2 {
    public static void main(String[] args) {
        try {
            KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance("SunX509");
            KeyStore keyStore = KeyStore.getInstance("JKS");
            char[] password = "password".toCharArray();
            keyStore.load(null, password);
            keyManagerFactory.init(keyStore, password);
        } catch (KeyStoreException | NoSuchAlgorithmException | UnrecoverableKeyException e) {
            e.printStackTrace();
        }
    }
}
