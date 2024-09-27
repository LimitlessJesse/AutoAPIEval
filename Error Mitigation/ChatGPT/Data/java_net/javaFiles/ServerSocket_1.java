import java.io.IOException;
import java.net.ServerSocket;
import java.net.SocketAddress;

public class ServerSocket_1 {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket();
            SocketAddress endpoint = new InetSocketAddress("127.0.0.1", 8080);
            serverSocket.bind(endpoint);
            System.out.println("ServerSocket bound to address: " + endpoint);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
