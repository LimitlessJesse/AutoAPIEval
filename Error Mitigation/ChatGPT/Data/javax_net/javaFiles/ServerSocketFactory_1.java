import javax.net.ServerSocketFactory;
import java.io.IOException;
import java.net.ServerSocket;

public class ServerSocketFactory_1 {
    public static void main(String[] args) {
        int port = 8080;
        
        ServerSocketFactory factory = ServerSocketFactory.getDefault();
        try {
            ServerSocket serverSocket = factory.createServerSocket(port);
            System.out.println("ServerSocket created on port: " + port);
        } catch (IOException e) {
            System.err.println("Error creating ServerSocket: " + e.getMessage());
        }
    }
}
