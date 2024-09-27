import javax.net.ssl.*;
import java.util.Arrays;

public class SSLEngine_22 {
    public static void main(String[] args) {
        // Create a SSL context
        SSLContext sslContext = null;
        try {
            sslContext = SSLContext.getDefault();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        // Create a SSL engine
        SSLEngine sslEngine = sslContext.createSSLEngine();

        // Create SSL parameters
        SSLParameters sslParams = new SSLParameters();
        sslParams.setCipherSuites(new String[] { "TLS_DHE_RSA_WITH_AES_128_CBC_SHA" });
        sslParams.setProtocols(Arrays.asList("TLSv1.2"));

        // Set SSL parameters
        sslEngine.setSSLParameters(sslParams);
    }
}
