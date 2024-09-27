import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import java.util.Arrays;

public class SSLContext_3 {
    public static void main(String[] args) throws Exception {
        // Create a SSLContext
        SSLContext sslContext = SSLContext.getDefault();

        // Create a SSLEngine
        SSLEngine sslEngine = sslContext.createSSLEngine();

        // Print the enabled cipher suites
        System.out.println("Enabled Cipher Suites: " + Arrays.toString(sslEngine.getEnabledCipherSuites()));

        // Print the supported cipher suites
        System.out.println("Supported Cipher Suites: " + Arrays.toString(sslEngine.getSupportedCipherSuites()));
    }
}
