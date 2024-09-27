import javax.net.ServerSocketFactory;
import java.io.IOException;
import java.net.ServerSocket;

public class ServerSocketFactory_4 {
    public static void main(String[] args) {
        ServerSocketFactory factory = ServerSocketFactory.getDefault();
        try {
            ServerSocket serverSocket = factory.createServerSocket();
            System.out.println("Server socket created: " + serverSocket);
        } catch (IOException e) {
            System.err.println("Error creating server socket: " + e.getMessage());
        }
    }
}
