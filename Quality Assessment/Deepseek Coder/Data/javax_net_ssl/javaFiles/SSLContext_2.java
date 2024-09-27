import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;

public class SSLContext_2 {
    public static void main(String[] args) throws Exception {
        SSLContext sslContext = SSLContext.getInstance("TLSv1.2");
        SSLEngine engine = sslContext.createSSLEngine();
        System.out.println(engine);
    }
}
