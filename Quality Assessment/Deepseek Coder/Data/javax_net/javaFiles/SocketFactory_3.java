import java.net.Socket;
import java.net.SocketException;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;

public class SocketFactory_3 {
    public static void main(String[] args) {
        String host = "www.example.com";
        int port = 443;

        SocketFactory socketFactory = SSLSocketFactory.getDefault();
        try {
            Socket socket = socketFactory.createSocket(host, port);
            System.out.println("Socket created successfully!");
        } catch (SocketException e) {
            System.out.println("Failed to create socket: " + e.getMessage());
        }
    }
}
