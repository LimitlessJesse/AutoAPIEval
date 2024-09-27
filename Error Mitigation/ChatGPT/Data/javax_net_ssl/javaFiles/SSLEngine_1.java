import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLException;

public class SSLEngine_1 {
    public static void main(String[] args) {
        SSLEngine sslEngine = null; // Initialize your SSLEngine object
        
        try {
            sslEngine.beginHandshake();
        } catch (SSLException e) {
            e.printStackTrace();
        }
    }
}
