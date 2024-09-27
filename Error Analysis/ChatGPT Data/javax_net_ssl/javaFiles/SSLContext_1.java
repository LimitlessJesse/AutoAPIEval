import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLParameters;

public class SSLContext_1 {
    public static void main(String[] args) {
        try {
            SSLContext sslContext = SSLContext.getDefault();
            SSLParameters sslParameters = sslContext.getSupportedSSLParameters();
            System.out.println("Supported Cipher Suites: " + String.join(", ", sslParameters.getCipherSuites()));
            System.out.println("Supported Protocols: " + String.join(", ", sslParameters.getProtocols()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
