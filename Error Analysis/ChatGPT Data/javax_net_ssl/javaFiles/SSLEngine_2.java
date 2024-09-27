import javax.net.ssl.SSLEngine;

public class SSLEngine_2 {
    public static void main(String[] args) {
        SSLEngine engine = SSLEngine.getInstance("TLS");
        engine.beginHandshake();
    }
}
