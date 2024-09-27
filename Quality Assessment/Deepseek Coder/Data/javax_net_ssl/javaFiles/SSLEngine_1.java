import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLContext;
import java.util.Arrays;

public class SSLEngine_1 {
    public static void main(String[] args) {
        try {
            // Create a SSLContext
            SSLContext sslContext = SSLContext.getDefault();

            // Create a SSLEngine
            SSLEngine sslEngine = sslContext.createSSLEngine();

            // Define the cipher suites
            String[] cipherSuites = {"TLS_DHE_RSA_WITH_AES_128_CBC_SHA", "TLS_DHE_DSS_WITH_AES_128_CBC_SHA"};

            // Set the enabled cipher suites
            sslEngine.setEnabledCipherSuites(cipherSuites);

            // Print the enabled cipher suites
            System.out.println("Enabled Cipher Suites: " + Arrays.toString(sslEngine.getEnabledCipherSuites()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
