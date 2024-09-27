import javax.net.ssl.KeyManagerFactory;
import java.security.KeyStore;
import java.security.Security;

public class KeyManagerFactory_4 {
    public static void main(String[] args) {
        KeyStore ks = // initialize KeyStore here
        char[] password = // initialize password here
        try {
            KeyManagerFactory kmf = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
            kmf.init(ks, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
