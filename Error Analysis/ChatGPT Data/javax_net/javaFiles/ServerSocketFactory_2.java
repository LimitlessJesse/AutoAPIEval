import javax.net.ServerSocketFactory;
import java.io.IOException;
import java.net.ServerSocket;

public class ServerSocketFactory_2 {
    public static void main(String[] args) {
        int port = 8080;
        try {
            ServerSocketFactory factory = ServerSocketFactory.getDefault();
            ServerSocket serverSocket = factory.createServerSocket(port);
            System.out.println("ServerSocket created on port " + port);
            // Further code logic can be added here to handle incoming connections
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
