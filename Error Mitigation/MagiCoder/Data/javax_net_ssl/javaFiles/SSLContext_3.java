import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;

public class SSLContext_3 {
    public static void main(String[] args) {
        try {
            Provider provider = new Provider("MyProvider", 1.0, "My Provider");
            SSLContext sslContext = SSLContext.getInstance("TLS", provider);
            System.out.println(sslContext);
        } catch (NoSuchAlgorithmException | SSLException e) {
            e.printStackTrace();
        }
    }
}
