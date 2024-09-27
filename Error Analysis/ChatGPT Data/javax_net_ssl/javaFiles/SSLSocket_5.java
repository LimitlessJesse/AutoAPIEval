import javax.net.ssl.SSLSocket;

public class SSLSocket_5 {
    public static void main(String[] args) {
        SSLSocket sslSocket = (SSLSocket) socket;
        sslSocket.setNeedClientAuth(true);
    }
}
