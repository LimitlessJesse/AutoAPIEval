import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSession;

public class SSLSocket_2 {
    public static void main(String[] args) {
        try {
            SSLSocket sslSocket = (SSLSocket) sslServerSocket.accept();
            SSLSession sslSession = sslSocket.getSession();
            System.out.println("Cipher Suite: " + sslSession.getCipherSuite());
            System.out.println("Peer Host: " + sslSession.getPeerHost());
            System.out.println("Peer Port: " + sslSession.getPeerPort());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
