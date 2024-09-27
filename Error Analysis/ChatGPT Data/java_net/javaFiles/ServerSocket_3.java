import java.net.ServerSocket;
import java.net.InetAddress;
import java.io.IOException;

public class ServerSocket_3 {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8080);
            InetAddress address = serverSocket.getInetAddress();
            System.out.println("Server address: " + address.getHostAddress());
            serverSocket.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
