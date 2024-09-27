import javax.net.ServerSocketFactory;
import java.io.IOException;
import java.net.ServerSocket;

public class ServerSocketFactory_3 {
    public static void main(String[] args) {
        int port = 8080;
        int backlog = 50;

        ServerSocket serverSocket = null;
        try {
            ServerSocketFactory factory = ServerSocketFactory.getDefault();
            serverSocket = factory.createServerSocket(port, backlog);
            System.out.println("ServerSocket created on port " + port + " with backlog " + backlog);
        } catch (IOException e) {
            System.err.println("Error creating ServerSocket: " + e.getMessage());
        } finally {
            if (serverSocket != null) {
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    System.err.println("Error closing ServerSocket: " + e.getMessage());
                }
            }
        }
    }
}
