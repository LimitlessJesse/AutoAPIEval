import javax.net.ssl.SSLSocket;

public class SSLSocket_4 {
    public static void main(String[] args) {
        SSLSocket sslSocket = ...; // Initialize your SSLSocket here

        // Set session creation enabled or disabled
        sslSocket.setEnableSessionCreation(true);
    }
}
