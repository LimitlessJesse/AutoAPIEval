import javax.net.ssl.TrustManagerFactorySpi;
import javax.net.ssl.TrustManager;

public class TrustManagerFactorySpi_2 {
    public static void main(String[] args) {
        TrustManagerFactorySpi trustManagerFactorySpi = new TrustManagerFactorySpi() {
            @Override
            protected TrustManager[] engineGetTrustManagers() {
                return new TrustManager[0];
            }
        };
        
        TrustManager[] trustManagers = trustManagerFactorySpi.engineGetTrustManagers();
        System.out.println(trustManagers.length);
    }
}
