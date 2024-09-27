import javax.net.ssl.TrustManagerFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;

public class TrustManagerFactory_2 {
    public static void main(String[] args) {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("SunX509", "SunJSSE");
            System.out.println(trustManagerFactory);
        } catch (NoSuchAlgorithmException | NoSuchProviderException e) {
            e.printStackTrace();
        }
    }
}
