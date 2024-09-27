import javax.net.ssl.TrustManagerFactory;
import java.security.Provider;
import java.security.Security;

public class TrustManagerFactory_5 {
    public static void main(String[] args) {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            Provider provider = trustManagerFactory.getProvider();
            System.out.println("Provider: " + provider.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
