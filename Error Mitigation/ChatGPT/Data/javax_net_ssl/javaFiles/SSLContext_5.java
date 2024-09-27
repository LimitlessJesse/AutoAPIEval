import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;

public class SSLContext_5 {
    public static void main(String[] args) {
        try {
            SSLContext sslContext = SSLContext.getInstance("TLS");
            sslContext.init(null, null, null);
            SSLEngine sslEngine = sslContext.createSSLEngine();
            System.out.println("SSLEngine created successfully: " + sslEngine);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
