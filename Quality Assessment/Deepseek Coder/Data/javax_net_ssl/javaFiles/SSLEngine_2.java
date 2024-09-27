import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLContext;
import java.util.Arrays;

public class SSLEngine_2 {
    public static void main(String[] args) throws Exception {
        SSLContext sslContext = SSLContext.getDefault();
        SSLEngine sslEngine = sslContext.createSSLEngine();
        String[] enabledCipherSuites = sslEngine.getEnabledCipherSuites();
        System.out.println(Arrays.toString(enabledCipherSuites));
    }
}
