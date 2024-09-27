import javax.net.ssl.SSLEngine;

public class SSLEngine_10 {
    public static void main(String[] args) {
        SSLEngine engine = SSLContext.getInstance("TLS").createSSLEngine();
        boolean wantClientAuth = engine.getWantClientAuth();
        System.out.println("Want Client Auth: " + wantClientAuth);
    }
}
