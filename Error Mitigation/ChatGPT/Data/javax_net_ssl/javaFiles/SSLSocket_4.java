import javax.net.ssl.SSLSocket;

public class SSLSocket_4 {
    public static void main(String[] args) {
        SSLSocket sslSocket = new SSLSocket() {
            @Override
            public void setEnabledProtocols(String[] protocols) {
                // Implementation of setEnabledProtocols method
            }
        };
    }
}
