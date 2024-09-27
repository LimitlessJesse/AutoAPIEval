import javax.net.ssl.SSLContext;
import javax.net.ssl.NoSuchAlgorithmException;
import javax.net.ssl.NoSuchProviderException;

public class SSLContext_2 {
    public static void main(String[] args) {
        try {
            SSLContext sslContext = SSLContext.getInstance("TLS", "SunJSSE");
            System.out.println(sslContext);
        } catch (NoSuchAlgorithmException | NoSuchProviderException e) {
            e.printStackTrace();
        }
    }
}
