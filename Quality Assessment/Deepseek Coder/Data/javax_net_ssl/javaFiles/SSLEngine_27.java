import javax.net.ssl.SSLEngine;

public class SSLEngine_27 {
    public static void main(String[] args) {
        SSLEngine engine = SSLEngine.getInstance("TLS");
        engine.setUseClientMode(true);
    }
}
