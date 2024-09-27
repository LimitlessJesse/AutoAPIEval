import java.net.ServerSocket;
import java.net.SocketException;
import java.io.IOException;
import javax.net.ServerSocketFactory;

public class ServerSocketFactory_3 {
    public static void main(String[] args) {
        try {
            ServerSocketFactory factory = ServerSocketFactory.getDefault();
            ServerSocket serverSocket = factory.createServerSocket(8080, 100);
            System.out.println("Server socket created successfully.");
        } catch (SocketException e) {
            System.out.println("Socket exception occurred: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException occurred: " + e.getMessage());
        }
    }
}
