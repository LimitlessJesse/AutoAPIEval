import javax.net.ssl.SSLEngine;

public class SSLEngine_5 {
    public static void main(String[] args) {
        SSLEngine engine = SSLEngine.getInstance("TLS");
        engine.setUseClientMode(true);
    }
}
