import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLException;

public class SSLEngine_4 {
    public static void main(String[] args) {
        SSLEngine sslEngine = null; // Initialize your SSLEngine object
        
        try {
            sslEngine.closeInbound();
            System.out.println("Inbound closed successfully");
        } catch (SSLException e) {
            System.err.println("Error closing inbound: " + e.getMessage());
        }
    }
}
