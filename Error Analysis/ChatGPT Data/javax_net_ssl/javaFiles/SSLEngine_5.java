import javax.net.ssl.SSLEngine;

public class SSLEngine_5 {
    public static void main(String[] args) {
        SSLEngine sslEngine = SSLEngine.getInstance("TLS");
        
        // Setting SSLEngine to client mode
        sslEngine.setUseClientMode(true);
        
        // Checking if SSLEngine is in client mode
        boolean isClientMode = sslEngine.getUseClientMode();
        System.out.println("Is SSLEngine in client mode: " + isClientMode);
    }
}
