import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;

public class SSLSocket_14 {
    public static void main(String[] args) {
        try {
            SSLSocketFactory factory = (SSLSocketFactory) SSLSocketFactory.getDefault();
            SSLSocket socket = (SSLSocket) factory.createSocket("www.example.com", 443);
            socket.startHandshake();
            boolean needClientAuth = socket.getNeedClientAuth();
            System.out.println("Need client authentication: " + needClientAuth);
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
