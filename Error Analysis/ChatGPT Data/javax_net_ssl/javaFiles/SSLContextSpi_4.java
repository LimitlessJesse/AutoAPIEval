import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLContextSpi;

public class SSLContextSpi_4 {
    public static void main(String[] args) {
        SSLContext context = SSLContext.getInstance("TLS");
        SSLContextSpi spi = context.getProvider().createContext("TLS", null);
        SSLEngine engine = spi.engineCreateSSLEngine();
        System.out.println("SSLEngine created: " + engine);
    }
}
