import javax.net.ssl.SSLContext;
import javax.net.ssl.KeyManager;
import javax.net.ssl.TrustManager;
import java.security.SecureRandom;
import javax.net.ssl.KeyManagementException;

public class SSLContext_2 {
    public static void main(String[] args) {
        try {
            SSLContext sslContext = SSLContext.getInstance("TLS");
            KeyManager[] keyManagers = null; // provide your KeyManager implementation here
            TrustManager[] trustManagers = null; // provide your TrustManager implementation here
            SecureRandom secureRandom = new SecureRandom(); // provide your SecureRandom implementation here

            sslContext.init(keyManagers, trustManagers, secureRandom);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
