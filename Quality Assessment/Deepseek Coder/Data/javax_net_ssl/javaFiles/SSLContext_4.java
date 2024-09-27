import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import java.util.Arrays;

public class SSLContext_4 {
    public static void main(String[] args) {
        try {
            // Create a SSLContext
            SSLContext sslContext = SSLContext.getDefault();

            // Create a SSLEngine
            SSLEngine sslEngine = sslContext.createSSLEngine("www.example.com", 443);

            // Set the necessary SSL parameters
            sslEngine.setEnabledProtocols(new String[] {"TLSv1.2"});
            sslEngine.setEnabledCipherSuites(Arrays.asList(sslEngine.getSupportedCipherSuites()));

            // Perform the handshake
            sslEngine.beginHandshake();

            // Print the session information
            System.out.println("Cipher suite: " + sslEngine.getSession().getCipherSuite());
            System.out.println("Protocol: " + sslEngine.getSession().getProtocol());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
