import javax.net.ssl.SSLSocket;

public class SSLSocket_3 {
    public static void main(String[] args) {
        SSLSocket sslSocket = new SSLSocket() {
            @Override
            public void setEnabledCipherSuites(String[] suites) {
                // Implementation of setEnabledCipherSuites method
            }
        };
        
        String[] cipherSuites = {"TLS_RSA_WITH_AES_128_CBC_SHA", "TLS_RSA_WITH_AES_256_CBC_SHA"};
        sslSocket.setEnabledCipherSuites(cipherSuites);
    }
}
