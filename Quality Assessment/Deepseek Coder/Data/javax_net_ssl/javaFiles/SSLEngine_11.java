import javax.net.ssl.SSLEngine;

public class SSLEngine_11 {
    public static void main(String[] args) {
        SSLEngine engine = SSLEngine.getInstance("TLS");
        engine.setWantClientAuth(true);
    }
}
