import javax.net.ssl.TrustManagerFactory;
import java.security.NoSuchAlgorithmException;

public class TrustManagerFactory_1 {
    public static void main(String[] args) {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("SunX509");
            System.out.println(trustManagerFactory);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
