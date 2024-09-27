import java.net.Socket;
import javax.net.SocketFactory;
import java.io.IOException;

public class SocketFactory_1 {
    public static void main(String[] args) {
        try {
            SocketFactory socketFactory = SocketFactory.getDefault();
            Socket socket = socketFactory.createSocket("www.example.com", 80);
            System.out.println("Socket created successfully!");
            socket.close();
        } catch (IOException e) {
            System.out.println("Failed to create socket: " + e.getMessage());
        }
    }
}
