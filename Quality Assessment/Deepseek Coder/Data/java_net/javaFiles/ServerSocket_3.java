import java.net.ServerSocket;
import java.net.InetSocketAddress;
import java.io.IOException;

public class ServerSocket_3 {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket();
            InetSocketAddress socketAddress = new InetSocketAddress("localhost", 8080);
            serverSocket.bind(socketAddress);
            System.out.println("Server is listening on port " + socketAddress.getPort());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
