import java.net.Socket;
import java.net.InetSocketAddress;
import java.io.IOException;

public class Socket_1 {
    public static void main(String[] args) {
        Socket socket = new Socket();
        InetSocketAddress address = new InetSocketAddress("example.com", 80);
        
        try {
            socket.connect(address);
            System.out.println("Socket connected to: " + address);
        } catch (IOException e) {
            System.out.println("An error occurred during the connection: " + e.getMessage());
        }
    }
}
