import javax.net.ssl.SSLEngine;

public class SSLEngine_6 {
    public static void main(String[] args) {
        SSLEngine engine = SSLContext.getInstance("TLS").createSSLEngine();
        boolean clientMode = engine.getUseClientMode();
        System.out.println("Use Client Mode: " + clientMode);
    }
}
