import java.net.Socket;
import java.net.InetSocketAddress;
import java.io.IOException;

public class Socket_4 {
    public static void main(String[] args) {
        Socket socket = new Socket();
        InetSocketAddress endpoint = new InetSocketAddress("127.0.0.1", 8080);
        
        try {
            socket.connect(endpoint);
            System.out.println("Connected to " + endpoint);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
