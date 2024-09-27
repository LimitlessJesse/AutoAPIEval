import java.net.ServerSocket;
import java.net.SocketException;
import java.io.IOException;

public class ServerSocketFactory_2 {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = ServerSocketFactory.getDefault().createServerSocket(8080);
            System.out.println("Server socket created successfully on port 8080");
        } catch (SocketException e) {
            System.out.println("Socket exception occurred: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException occurred: " + e.getMessage());
        }
    }
}
