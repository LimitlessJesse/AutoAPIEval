import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;

public class SSLContext_3 {
    public static void main(String[] args) {
        try {
            String host = "example.com";
            int port = 443;
            
            SSLContext sslContext = SSLContext.getDefault();
            SSLEngine sslEngine = sslContext.createSSLEngine(host, port);
            
            System.out.println("SSLEngine created successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
