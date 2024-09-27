import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.TrustManager;

public class TrustManagerFactory_1 {
    public static void main(String[] args) {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init(null);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            System.out.println("TrustManagers obtained successfully.");
        } catch (Exception e) {
            System.out.println("Error getting TrustManagers: " + e.getMessage());
        }
    }
}
