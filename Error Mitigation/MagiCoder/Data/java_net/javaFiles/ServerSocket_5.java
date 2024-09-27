import java.net.ServerSocket;
import java.net.SocketAddress;
import java.net.InetSocketAddress;
import java.io.IOException;

public class ServerSocket_5 {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket();
            SocketAddress endpoint = new InetSocketAddress("localhost", 8080);
            serverSocket.bind(endpoint);
            System.out.println("Server is listening on port 8080");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
