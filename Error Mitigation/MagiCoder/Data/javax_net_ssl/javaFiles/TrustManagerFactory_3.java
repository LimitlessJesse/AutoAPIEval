import javax.net.ssl.TrustManagerFactory;
import java.security.Provider;
import java.security.NoSuchAlgorithmException;

public class TrustManagerFactory_3 {
    public static void main(String[] args) {
        try {
            Provider provider = new Provider("SunJSSE", 1.0, "Sun JSSE Provider");
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("SunX509", provider);
            System.out.println(trustManagerFactory);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
