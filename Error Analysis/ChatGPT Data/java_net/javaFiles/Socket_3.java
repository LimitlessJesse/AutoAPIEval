import java.net.Socket;
import java.net.InetSocketAddress;
import java.io.IOException;

public class Socket_3 {
    public static void main(String[] args) {
        Socket socket = new Socket();
        try {
            socket.bind(new InetSocketAddress("127.0.0.1", 8080));
            System.out.println("Socket bound successfully");
        } catch (IOException e) {
            System.out.println("Error binding socket: " + e.getMessage());
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                System.out.println("Error closing socket: " + e.getMessage());
            }
        }
    }
}
