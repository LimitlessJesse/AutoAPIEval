import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;

public class SSLSocket_18 {
    public static void main(String[] args) {
        try {
            SSLSocketFactory factory = (SSLSocketFactory) SSLSocketFactory.getDefault();
            SSLSocket socket = (SSLSocket) factory.createSocket("www.example.com", 443);
            socket.setUseClientMode(true); // Enable session creation
            socket.startHandshake();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
