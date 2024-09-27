import javax.net.ssl.TrustManagerFactory;
import java.security.KeyStore;

public class TrustManagerFactory_5 {
    public static void main(String[] args) {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("SunX509");
        KeyStore ks = KeyStore.getInstance("JKS");
        trustManagerFactory.init(ks);
    }
}
