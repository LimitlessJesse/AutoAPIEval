import java.net.Socket;
import java.net.SocketException;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;

public class SocketFactory_2 {
    public static void main(String[] args) {
        SocketFactory factory = SSLSocketFactory.getDefault();
        try {
            Socket socket = factory.createSocket();
            System.out.println("Socket created successfully");
        } catch (SocketException e) {
            System.out.println("Failed to create socket: " + e.getMessage());
        }
    }
}
