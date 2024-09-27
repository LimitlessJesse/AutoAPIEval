import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;

public class SSLSocket_12 {
    public static void main(String[] args) {
        try {
            SSLSocketFactory factory = (SSLSocketFactory) SSLSocketFactory.getDefault();
            SSLSocket socket = (SSLSocket) factory.createSocket("www.example.com", 443);
            socket.startHandshake();
            boolean clientMode = socket.getUseClientMode();
            System.out.println("Use Client Mode: " + clientMode);
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
