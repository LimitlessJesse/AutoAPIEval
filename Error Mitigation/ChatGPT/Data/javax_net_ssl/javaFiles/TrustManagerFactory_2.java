import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.TrustManager;

public class TrustManagerFactory_2 {
    public static void main(String[] args) {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("SunX509");
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        
        for (TrustManager trustManager : trustManagers) {
            System.out.println(trustManager.toString());
        }
    }
}
