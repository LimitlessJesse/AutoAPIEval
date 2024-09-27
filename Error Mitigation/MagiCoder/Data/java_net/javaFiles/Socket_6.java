import java.net.Socket;
import java.net.SocketAddress;
import java.net.InetSocketAddress;
import java.io.IOException;

public class Socket_6 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket();
            SocketAddress endpoint = new InetSocketAddress("www.example.com", 80);
            socket.connect(endpoint);
            System.out.println("Connected to the server");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
